package cart;

import entity.Product;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lee Nguyen
 */
public class ShoppingCart {
    List<ShoppingCartItem> listItems;
    int numOfItems;
    double total;
    
    public ShoppingCart() {
        listItems = new ArrayList<>();
        numOfItems = 0;       
        total = 0;
    }
    
    public synchronized void addItem(Product product) {    
        boolean isNewItem = true;
        for (ShoppingCartItem scItem: listItems){
            if (scItem.getProduct().getProductId().equals(product.getProductId())) {   
                // product already exists
                isNewItem = false;
                scItem.incrementQuantity();
            }
        }   
        if (isNewItem) {
            ShoppingCartItem newItem = new ShoppingCartItem(product);
            listItems.add(newItem);
        }
    }
    
    public synchronized void update(Product product, String quantity) {
        short qty = Short.parseShort(quantity);
        
        if (qty >= 0) {
            ShoppingCartItem item = null;
            for (ShoppingCartItem scItem: listItems) {
                if (scItem.getProduct().getProductId().equals(product.getProductId())) {
                    if (qty != 0) {
                        // set item quantity to new value
                        scItem.setQuantity(qty);
                        break;
                    } else {
                        // quantity = 0 =>  save to item and break
                        item = scItem;
                        break;
                    }
                }
            }
            if (item != null) {
                // remove from cart
                listItems.remove(item);
            }
        }
    }
    
    public synchronized List<ShoppingCartItem> getItems() {
        return listItems;
    }
    
    public synchronized int getNumberOfItems() {
        numOfItems = 0;
        listItems.forEach((scItem) -> {
            numOfItems += scItem.getQuantity();
        });
        return numOfItems;

    }
    
    public synchronized int getNumberOfProducts() {
        return listItems.size();
    }
    
    public synchronized String getSubtotalCurrencyFormat() {
        double amount = 0;
        for (ShoppingCartItem scItem: listItems) {
            Product product = (Product) scItem.getProduct();
            amount += (scItem.getQuantity()*product.getPrice().doubleValue());
        }
        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return currencyFormat.format(amount);
    }
    
    public synchronized double getSubtotal() {
        double amount = 0;
        for (ShoppingCartItem scItem: listItems) {
            Product product = (Product) scItem.getProduct();
            amount += (scItem.getQuantity()*product.getPrice().doubleValue());
        }
        return amount;
    }
    
    public synchronized void calculateTotal (String surcharge) {
        double amount = 0;
        
        // cast surcharge as double
        double s = Double.parseDouble(surcharge);
        
        amount = this.getSubtotal();
        amount += s;
        
        total = amount;
    }
    
    public synchronized double getTotal() {

        return total;
    }
    
    public synchronized String getTotalCurrencyFormat() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return currencyFormat.format(total);
    }
    
    public synchronized void removeItem(Product product) {
        for (ShoppingCartItem scItem: listItems){
            if (scItem.getProduct().getProductId().equals(product.getProductId())) {   
                listItems.remove(scItem);
                return;
            }
        }
    }
    
    public synchronized void clear() {
        listItems.clear();
        numOfItems = 0;
        total = 0;
    }
}
