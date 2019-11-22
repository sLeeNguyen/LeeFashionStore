package session_bean;

import entity.Category;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lee Nguyen
 */
@Stateless
public class CategorySessionBean extends AbstractSessionBean<Category>{
    
    @PersistenceContext(unitName = "LeeFashionStorePU")
    private EntityManager em;

    public CategorySessionBean() {
        super(Category.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
