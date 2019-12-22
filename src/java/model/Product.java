package model;

import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author Lee Nguyen
 */
public class Product {
    private String productId;
    private String name;
    private float price;
    private int quantity;
    private String description;
    private String image;
    private Date lastUpdate;
    private String categoryId;
    
    public Product() {
        
    }
    
    public Product(String productId, String name, float price, int quantity, String description, String image, Date lastUpdate, String categoryId) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
        this.lastUpdate = lastUpdate;
        this.categoryId = categoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    
    public String getPriceFormat() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return currencyFormat.format(this.price);
    }
    
}
