/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bean;

import entity.Productdetail;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lee Nguyen
 */
@Stateless
public class ProductDetailSessionBean extends AbstractSessionBean<Productdetail> {
    @PersistenceContext(unitName = "LeeFashionStorePU")
    private EntityManager em;

    public ProductDetailSessionBean() {
        super(Productdetail.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
