package session_bean;

import entity.Customerorder;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lee Nguyen
 */
@Stateless
public class CustomerOrderSessionBean extends AbstractSessionBean<Customerorder> {

    @PersistenceContext(unitName = "LeeFashionStore")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerOrderSessionBean() {
        super(Customerorder.class);
    }
    
    public Customerorder find(Object id) {
        Customerorder order = em.find(Customerorder.class, id);
        em.refresh(order);
        return order;
    }

    public Customerorder findByCustomer(Object customer) {
        return (Customerorder) em.createNamedQuery("CustomerOrder.findByCustomer").setParameter("customer",
                customer).getSingleResult();
    }
}
