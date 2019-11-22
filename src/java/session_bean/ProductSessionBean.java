package session_bean;

import entity.Product;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lee Nguyen
 */
@Stateless
public class ProductSessionBean extends AbstractSessionBean<Product>{

    @PersistenceContext(unitName = "LeeFashionStorePU")
    private EntityManager em;

    public ProductSessionBean() {
        super(Product.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
