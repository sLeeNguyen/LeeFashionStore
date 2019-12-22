package model;

import java.util.Date;



/**
 *
 * @author Lee Nguyen
 */
public class CustomerOrder {
    private int orderId;
    private float amount;
    private Date dateCreate;
    private long confirmationNumber;
    private int customerId;

    public CustomerOrder(int orderId, float amount, Date dateCreate, long confirmationNumber, int customerId) {
        this.orderId = orderId;
        this.amount = amount;
        this.dateCreate = dateCreate;
        this.confirmationNumber = confirmationNumber;
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public long getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(long confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    
}
