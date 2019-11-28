package controller;


import entity.Category;
import entity.Product;
import entity.Productdetail;
import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet(name = "ControllerServlet", urlPatterns={"/ControllerServlet", "/category", "/product"})
public class ControllerServlet extends HttpServlet {
    
    @EJB
    private CategorySessionBean categorySessionBean;
            
    @EJB
    private ProductSessionBean productSessionBean;
    
    @EJB
    private ProductDetailSessionBean productDetailSessionBean;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {;
            System.out.println("servlet");
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        if (userPath.equals("/category")) {
            String categoryId = request.getQueryString();
            if (categoryId != null){
                Category selectedCategory;
                List<Product> categoryProducts;
                selectedCategory = categorySessionBean.find(new String(categoryId));
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
                selectedProduct = productSessionBean.find(new String(productId));
                selectedProductDetail = productDetailSessionBean.find(new String(productId));
                session.setAttribute("selectedProduct", selectedProduct);
                session.setAttribute("selectedProductDetail", selectedProductDetail);
            }
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
        
    }
}
