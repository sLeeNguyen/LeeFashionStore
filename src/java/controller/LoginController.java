package controller;

import dao.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Lee Nguyen
 */
@WebServlet(name = "LoginController", urlPatterns = {"/Log"})
public class LoginController extends HttpServlet {
    private UserDAO ud = new UserDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        String userPath = "index";
        String action = request.getParameter("action");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        if (null == action) {
            // break
            System.out.println("action null");
        }
        else switch (action) {
            case "SignIn":
                if (ud.checkUserExists(username)) {
                    
                }
                if ("admin".equals(username) && "admin".equals(password)) {
                    session.setAttribute("name", "admin");
                    session.setAttribute("role", "admin");
                    session.setAttribute("isLogined", true);
                }
                else if ("lee".equals(username) && "lee".equals(password)) {
                    session.setAttribute("name", "lee");
                    session.setAttribute("role", "customer");
                    session.setAttribute("isLogined", true);
                }
                else {
                    
                }
                break;
            case "SignOut":
                session.removeAttribute("name");
                session.removeAttribute("role");
                session.removeAttribute("exists");
                session.setAttribute("isLogined", false);
                break;
            case "SignUp":
                String email = request.getParameter("email");
                String name = request.getParameter("fullname");
                String address = request.getParameter("address");
                if (ud.checkUserExists(username)) {
                    session.setAttribute("exists", username);
                    userPath = "signup";
                }
                else {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setEmail(email);
                    user.setFullname(name);
                    user.setRole("user");
                    user.setAddress(address);
                    if (ud.add(user)) {
                        session.removeAttribute("exists");
                        session.setAttribute("name", username);
                        session.setAttribute("role", "user");
                        session.setAttribute("isLogined", true);
                    }
                }
                break;
            default:
                break;
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
