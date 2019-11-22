package listener;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import session_bean.CategorySessionBean;
import session_bean.ProductSessionBean;

/**
 * Web application lifecycle listener.
 *
 * @author Lee Nguyen
 */
public class ControllerListener implements ServletContextListener {
    
    @EJB
    ProductSessionBean productSessionBean;  
    
    @EJB
    CategorySessionBean categorySessionBean;
    
    ServletContext context;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        context = sce.getServletContext();
        context.setAttribute("newProducts", productSessionBean.findRange(new int[] {0, 9}));
        context.setAttribute("categories", categorySessionBean.findAll());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        this.context = null;
    }
}
