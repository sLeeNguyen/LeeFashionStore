package controller;


import cart.ShoppingCart;
import entity.Category;
import entity.Product;
import entity.Productdetail;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session_bean.CategorySessionBean;
import session_bean.ProductDetailSessionBean;
import session_bean.ProductSessionBean;
/**
 *
 * @author Lee Nguyen
 */

@WebServlet(name = "ControllerServlet", urlPatterns={"/ControllerServlet", 
                                                     "/category", 
                                                     "/product",
                                                     "/manage",
                                                     "/viewCart",
                                                     "/addToCart",
                                                     "/updateCart",
                                                     "/removeItem"})
public class ControllerServlet extends HttpServlet {
    
    @EJB
    private CategorySessionBean categorySessionBean;
            
    @EJB
    private ProductSessionBean productSessionBean;
    
    @EJB
    private ProductDetailSessionBean productDetailSessionBean;
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    @SuppressWarnings("empty-statement")
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {;
            
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        if (userPath.equals("/category")) {
            String categoryId = request.getQueryString();
            if (categoryId != null){
                Category selectedCategory;
                List<Product> categoryProducts;
                selectedCategory = categorySessionBean.find(categoryId);
                session.setAttribute("selectedCategory", selectedCategory);
                categoryProducts = (List<Product>) selectedCategory.getProductCollection();
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
            Productdetail selectedProductDetail;
            String productId = request.getQueryString();
            if (productId != null) {
                selectedProduct = productSessionBean.find(productId);
                selectedProductDetail = productDetailSessionBean.find(productId);
                session.setAttribute("selectedProduct", selectedProduct);
                session.setAttribute("selectedProductDetail", selectedProductDetail);
            }
        }
        else if (userPath.equals("/manage")) {
            Product selectedProduct;
            List<Product> listProducts = productSessionBean.findAll();
            session.setAttribute("listProducts", listProducts);
            response.sendRedirect("/LeeFashionStore/admin/manage/page/products.jsp");
            return;
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
                Product product = productSessionBean.find(productId);
                cart.addItem(product);
            }
           
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        }
        else if (userPath.equals("/updateCart")) {
            String productId = request.getParameter("productId");
            String quatity = request.getParameter("quantity");
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            
            Product product = productSessionBean.find(productId);
            if (product != null) cart.update(product, quatity);
            
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        }
        else if (userPath.equals("/removeItem")) {
            String productId = request.getParameter("productId");
            Product product = productSessionBean.find(productId);
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            if (product != null) {
                cart.removeItem(product);
            }
            
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        }
        
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
