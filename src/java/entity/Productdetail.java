/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lee Nguyen
 */
@Entity
@Table(name = "Product_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productdetail.findAll", query = "SELECT p FROM Productdetail p")
    , @NamedQuery(name = "Productdetail.findByProductId", query = "SELECT p FROM Productdetail p WHERE p.productId = :productId")
    , @NamedQuery(name = "Productdetail.findByInformation", query = "SELECT p FROM Productdetail p WHERE p.information = :information")
    , @NamedQuery(name = "Productdetail.findByImage1", query = "SELECT p FROM Productdetail p WHERE p.image1 = :image1")
    , @NamedQuery(name = "Productdetail.findByImage2", query = "SELECT p FROM Productdetail p WHERE p.image2 = :image2")
    , @NamedQuery(name = "Productdetail.findByImage3", query = "SELECT p FROM Productdetail p WHERE p.image3 = :image3")
    , @NamedQuery(name = "Productdetail.findByImage4", query = "SELECT p FROM Productdetail p WHERE p.image4 = :image4")
    , @NamedQuery(name = "Productdetail.findByImage5", query = "SELECT p FROM Productdetail p WHERE p.image5 = :image5")})
public class Productdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "product_id")
    private String productId;
    @Size(max = 1000)
    @Column(name = "information")
    private String information;
    @Size(max = 255)
    @Column(name = "image1")
    private String image1;
    @Size(max = 255)
    @Column(name = "image2")
    private String image2;
    @Size(max = 255)
    @Column(name = "image3")
    private String image3;
    @Size(max = 255)
    @Column(name = "image4")
    private String image4;
    @Size(max = 255)
    @Column(name = "image5")
    private String image5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productdetailproductid")
    private Collection<Product> productCollection;

    public Productdetail() {
    }

    public Productdetail(String productId) {
        this.productId = productId;
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

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }
    
    public List<String> getAllImages() {
        List<String> list = new ArrayList<String>();
        if (image1 != null) list.add(image1);        
        if (image2 != null) list.add(image2);
        if (image3 != null) list.add(image3);
        if (image4 != null) list.add(image4);
        if (image5 != null) list.add(image5);
        return list;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productdetail)) {
            return false;
        }
        Productdetail other = (Productdetail) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Productdetail[ productId=" + productId + " ]";
    }
    
}
