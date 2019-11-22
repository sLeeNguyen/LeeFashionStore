/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lee Nguyen
 */
@Entity
@Table(name = "Ordered_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderedproduct.findAll", query = "SELECT o FROM Orderedproduct o")
    , @NamedQuery(name = "Orderedproduct.findByOrderId", query = "SELECT o FROM Orderedproduct o WHERE o.orderedproductPK.orderId = :orderId")
    , @NamedQuery(name = "Orderedproduct.findByProductId", query = "SELECT o FROM Orderedproduct o WHERE o.orderedproductPK.productId = :productId")
    , @NamedQuery(name = "Orderedproduct.findByQuantity", query = "SELECT o FROM Orderedproduct o WHERE o.quantity = :quantity")})
public class Orderedproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderedproductPK orderedproductPK;
    @Column(name = "quantity")
    private Integer quantity;
    @OneToMany(mappedBy = "orderedproduct")
    private Collection<Customerorder> customerorderCollection;

    public Orderedproduct() {
    }

    public Orderedproduct(OrderedproductPK orderedproductPK) {
        this.orderedproductPK = orderedproductPK;
    }

    public Orderedproduct(String orderId, String productId) {
        this.orderedproductPK = new OrderedproductPK(orderId, productId);
    }

    public OrderedproductPK getOrderedproductPK() {
        return orderedproductPK;
    }

    public void setOrderedproductPK(OrderedproductPK orderedproductPK) {
        this.orderedproductPK = orderedproductPK;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @XmlTransient
    public Collection<Customerorder> getCustomerorderCollection() {
        return customerorderCollection;
    }

    public void setCustomerorderCollection(Collection<Customerorder> customerorderCollection) {
        this.customerorderCollection = customerorderCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderedproductPK != null ? orderedproductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderedproduct)) {
            return false;
        }
        Orderedproduct other = (Orderedproduct) object;
        if ((this.orderedproductPK == null && other.orderedproductPK != null) || (this.orderedproductPK != null && !this.orderedproductPK.equals(other.orderedproductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Orderedproduct[ orderedproductPK=" + orderedproductPK + " ]";
    }
    
}
