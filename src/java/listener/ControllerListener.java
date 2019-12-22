package listener;

import dao.CategoryDAO;
import dao.ProductDAO;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Lee Nguyen
 */
public class ControllerListener implements ServletContextListener {
    
    private static ProductDAO pd = new ProductDAO();    
    private static CategoryDAO cd = new CategoryDAO();
    
    ServletContext context;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        context = sce.getServletContext();
        context.setAttribute("newProducts", pd.getProductsLike("pw"));
        context.setAttribute("categories", cd.getListCategory());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        this.context = null;
    }
}
