/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lee Nguyen
 */
@Entity
@Table(name = "Customer_order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customerorder.findAll", query = "SELECT c FROM Customerorder c")
    , @NamedQuery(name = "Customerorder.findByOrderId", query = "SELECT c FROM Customerorder c WHERE c.orderId = :orderId")
    , @NamedQuery(name = "Customerorder.findByAmount", query = "SELECT c FROM Customerorder c WHERE c.amount = :amount")
    , @NamedQuery(name = "Customerorder.findByDateCreate", query = "SELECT c FROM Customerorder c WHERE c.dateCreate = :dateCreate")
    , @NamedQuery(name = "Customerorder.findByConfirmationNumber", query = "SELECT c FROM Customerorder c WHERE c.confirmationNumber = :confirmationNumber")})
public class Customerorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "amount")
    private Integer amount;
    @Size(max = 10)
    @Column(name = "date_create")
    private String dateCreate;
    @Column(name = "confirmation_number")
    private Integer confirmationNumber;
    @JoinColumn(name = "Customercustomer_id", referencedColumnName = "customer_id")
    @ManyToOne
    private Customer customercustomerid;
    @JoinColumns({
        @JoinColumn(name = "Ordered_productorder_id", referencedColumnName = "order_id")
        , @JoinColumn(name = "Ordered_productproduct_id", referencedColumnName = "product_id")})
    @ManyToOne
    private Orderedproduct orderedproduct;

    public Customerorder() {
    }

    public Customerorder(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Integer getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(Integer confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public Customer getCustomercustomerid() {
        return customercustomerid;
    }

    public void setCustomercustomerid(Customer customercustomerid) {
        this.customercustomerid = customercustomerid;
    }

    public Orderedproduct getOrderedproduct() {
        return orderedproduct;
    }

    public void setOrderedproduct(Orderedproduct orderedproduct) {
        this.orderedproduct = orderedproduct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customerorder)) {
            return false;
        }
        Customerorder other = (Customerorder) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Customerorder[ orderId=" + orderId + " ]";
    }
    
}
