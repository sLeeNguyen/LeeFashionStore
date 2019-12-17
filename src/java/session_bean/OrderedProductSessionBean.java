/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bean;

import entity.Orderedproduct;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lee Nguyen
 */
@Stateless
public class OrderedProductSessionBean extends AbstractSessionBean<Orderedproduct>{
    @PersistenceContext(unitName = "LeeFashionStore")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderedProductSessionBean() {
        super(Orderedproduct.class);
    }

    public List<Orderedproduct> findByOrderId(Object id) {
        return em.createNamedQuery("OrderedProduct.findByOrderId").setParameter("orderId",id).getResultList();
    }
}
