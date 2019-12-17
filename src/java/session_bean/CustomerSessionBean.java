package session_bean;

import entity.Customer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
*
* @author Lee Nguyen
*/
@Stateless
public class CustomerSessionBean extends AbstractSessionBean<Customer> {

    @PersistenceContext(unitName = "LeeFashionStore")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerSessionBean() {
        super(Customer.class);
    }
}
