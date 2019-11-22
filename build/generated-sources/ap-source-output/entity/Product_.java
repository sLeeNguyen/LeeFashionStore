package entity;

import entity.Category;
import entity.Productdetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-21T09:02:07")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Productdetail> productdetailproductid;
    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, String> thumbImage;
    public static volatile SingularAttribute<Product, String> productId;
    public static volatile SingularAttribute<Product, String> descriptionDetail;
    public static volatile SingularAttribute<Product, Float> price;
    public static volatile SingularAttribute<Product, String> lastUpdate;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Category> categorycategoryid;

}