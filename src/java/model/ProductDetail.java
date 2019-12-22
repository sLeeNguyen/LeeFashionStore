package model;

import java.util.ArrayList;

/**
 *
 * @author Lee Nguyen
 */
public class ProductDetail {
    private String productId;
    private String information;
    private String size;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;

    public ProductDetail(String productId, String information, String size, String image1, String image2, String image3, String image4, String image5) {
        this.productId = productId;
        this.information = information;
        this.size = size;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.image5 = image5;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }
    
    public ArrayList<String> getAllImages() {
        ArrayList<String> images = new ArrayList<>();
        if (image1 != null) {
            images.add(image1);
        }
        if (image2 != null) {
            images.add(image2);
        }
        if (image3 != null) {
            images.add(image3);
        }
        if (image4 != null) {
            images.add(image4);
        }
        if (image5 != null) {
            images.add(image5);
        }
        return images;
    }
}
