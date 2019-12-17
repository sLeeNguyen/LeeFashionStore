package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lee Nguyen
 */
@WebServlet(name = "LoginController", urlPatterns = {"/Log"})
public class LoginController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        String action = request.getParameter("action");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        session.setAttribute("role", "customer");
        if (null == action) {
            // break
            System.out.println("action null");
        }
        else switch (action) {
            case "SignIn":
                if ("admin".equals(username) && "admin".equals(password)) {
                    session.setAttribute("name", "admin");
                    session.setAttribute("role", "admin");
                } else {
                    
                }
                break;
            case "SignOut":
                session.setAttribute("name", null);
                break;
            case "SignUp":
                session.setAttribute("name", username);
                break;
            default:
                break;
        }
        
        try{
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
