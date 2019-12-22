/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Product;

/**
 *
 * @author Lee Nguyen
 */
@WebServlet(name = "ControlAdmin", urlPatterns = {"/ControlAdmin",
                                                  "/manage",
                                                  "/deleteProduct"})
public class ControlAdmin extends HttpServlet {
    private ProductDAO pd = new ProductDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userPath = request.getServletPath();  
        HttpSession session = request.getSession();
        
        if (userPath.equals("/manage")) {
            Product selectedProduct;
            ArrayList<Product> listProducts =pd.getAllProducts();
            session.setAttribute("listProducts", listProducts);
            response.sendRedirect("/LeeFashionStore/admin/manage/page/products.jsp");
            return;
        } 
        else if (userPath.equals("/deleteProduct")) {
            String productId = request.getQueryString();
            if (productId != null) {
                pd.delete(productId);
            }
             ArrayList<Product> listProducts =pd.getAllProducts();
            session.setAttribute("listProducts", listProducts);
            response.sendRedirect("/LeeFashionStore/admin/manage/page/products.jsp");
            return;
        }

//        try{
//            request.getRequestDispatcher(url).forward(request, response);
//        } catch (IOException | ServletException ex){
//            ex.printStackTrace();
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
