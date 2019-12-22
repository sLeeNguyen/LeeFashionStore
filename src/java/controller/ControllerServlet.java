package controller;


import cart.ShoppingCart;
import dao.CategoryDAO;
import dao.ProductDAO;
import dao.ProductDetailDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;
import model.Product;
import model.ProductDetail;

/**
 *
 * @author Lee Nguyen
 */

@WebServlet(name = "ControllerServlet", urlPatterns={"/ControllerServlet", 
                                                     "/category", 
                                                     "/product",
                                                     "/viewCart",
                                                     "/addToCart",
                                                     "/updateCart",
                                                     "/removeItem",
                                                     "/purchase",
                                                     "/checkout"})
public class ControllerServlet extends HttpServlet {
    
    private CategoryDAO cd = new CategoryDAO(); 
    private ProductDAO pd = new ProductDAO();
    private ProductDetailDAO pdd = new ProductDetailDAO();

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {;
            
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        if (userPath.equals("/category")) {
            String categoryId = request.getQueryString();

            if (categoryId != null) {
                Category selectedCategory = cd.getCategoryById(categoryId);
                session.setAttribute("selectedCategory", selectedCategory);
                ArrayList<Product> categoryProducts = pd.getListProductsByCategoryId(categoryId);
                if ("cid1".equals(categoryId)) {
                    session.setAttribute("categoryProducts", categoryProducts.subList(0, categoryProducts.size()-2));
                }
                else if ("cid2".equals(categoryId)) {
                    session.setAttribute("categoryProducts", categoryProducts.subList(7, categoryProducts.size()));
                }
                else {
                    session.setAttribute("categoryProducts", categoryProducts);
                }
            }
        }
        else if (userPath.equals("/product")) {
            Product selectedProduct;
            ProductDetail selectedProductDetail;
            String productId = request.getQueryString();
            if (productId != null) {
                selectedProduct = pd.getProductById(productId);
                selectedProductDetail = pdd.getProductDetailById(productId);
                session.setAttribute("selectedProduct", selectedProduct);
                session.setAttribute("selectedProductDetail", selectedProductDetail);
            }
        }
        else if (userPath.equals("/viewCart")) {
            String clear = request.getParameter("clear");
            
            if ("true".equals(clear)) {
                ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
                cart.clear();
                String userView = (String) session.getAttribute("view");
                userPath = userView;
                System.out.println("clear");
            }
        }
        else if (userPath.equals("/addToCart")) {
            /*
                if user is adding item to cart for first time
                create cart object and attach it to user session
            */
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            
            if (cart == null) {
                cart = new ShoppingCart();
                session.setAttribute("cart", cart);
            }
            
            // get User input from request
            String productId = request.getQueryString();
            if (!productId.isEmpty()) {
                Product product = pd.getProductById(productId);
                cart.addItem(product);
            }
           
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        }
        else if (userPath.equals("/updateCart")) {
            String productId = request.getParameter("productId");
            String quatity = request.getParameter("quantity");
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            
            Product product = pd.getProductById(productId);
            if (product != null) cart.update(product, quatity);
            
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        }
        else if (userPath.equals("/removeItem")) {
            String productId = request.getParameter("productId");
            Product product = pd.getProductById(productId);
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            if (product != null) {
                cart.removeItem(product);
            }
            
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        }
        else if (userPath.equals("/checkout")) {
            String user = (String) session.getAttribute("name");
            if (user == null || user.isEmpty()) {
                session.setAttribute("isLogined", false);
                String userView = (String) session.getAttribute("view");
                userPath = userView;
            }
        }
//        else if (userPath.equals("/purchase")) {
//            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
//            if (cart != null) {
//                String name = request.getParameter("name");
//                String email = request.getParameter("email");
//                String phone = request.getParameter("phone");
//                String address = request.getParameter("address");
//                String cityRegion = request.getParameter("cityRegion");
//                String ccNumber = request.getParameter("creditcard");             
//                
//                int orderId = orderManager.placeOrder(name, email, phone, address, cityRegion, ccNumber, cart);
//                System.out.println(orderId);
//                if (orderId != 0) {
//                    Map orderMap = orderManager.getOrderDetails(orderId);
//                    
//                    // place order details in request scope
//                    request.setAttribute("customer", orderMap.get("customer"));
//                    request.setAttribute("products", orderMap.get("products"));
//                    request.setAttribute("orderRecord", orderMap.get("orderRecord"));
//                    request.setAttribute("orderedProducts", orderMap.get("orderedProducts"));               
//                    
//                    userPath = "/confirmation";
//                }
//                else {
//                    userPath = "/checkout";
//                }
//            }
//        }  
        
        String url = userPath + ".jsp";
        try{
            request.getRequestDispatcher(url).forward(request, response);
        } catch (IOException | ServletException ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
