package cart;

import model.Product;

/**
 *
 * @author Lee Nguyen
 */
public class ShoppingCartItem {
    Product product;
    int quantity;
    
    public ShoppingCartItem(Product product) {
        this.product = product;
        quantity = 1;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void incrementQuantity() {
        quantity++;
    }
    
    public void decrementQuantity() {
        quantity--;
    }
    
    public float getTotal() {
        float amount = 0;
        amount = this.getQuantity()*product.getPrice();
        return amount;
    }
}
