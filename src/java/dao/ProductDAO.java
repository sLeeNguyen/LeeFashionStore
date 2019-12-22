package dao;

import dbhandle.DatabaseHandle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author Lee Nguyen
 */
public class ProductDAO implements InterfaceDAO{
    private static DatabaseHandle dh = DatabaseHandle.getInstance();
    
    @Override
    public boolean add(Object obj) {
        Product p = (Product) obj;
        String sql = "INSERT INTO Product VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductId());
            pstm.setString(2, p.getName());
            pstm.setFloat(3, p.getPrice());
            pstm.setInt(4, p.getQuantity());
            pstm.setString(5, p.getDescription());
            pstm.setString(6, p.getImage());
            pstm.setString(7, p.getLastUpdate().toString());
            pstm.setString(8, p.getName());
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }

    @Override
    public boolean update(Object obj) {
        Product p = (Product) obj;
        String sql = "UPDATE Product SET name=?, price=?, quantity=?, description_detail=?,"
                + "image=?, last_update=?, category_id=? WHERE product_id=?";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getName());
            pstm.setFloat(2, p.getPrice());
            pstm.setInt(3, p.getQuantity());
            pstm.setString(4, p.getDescription());
            pstm.setString(5, p.getImage());
            pstm.setString(6, p.getLastUpdate().toString());
            pstm.setString(7, p.getName());
            pstm.setString(8, p.getProductId());
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }      
        
        return false;
    }

    public boolean delete(String pid) {
        String sql = "DELETE FROM Product WHERE product_id='" + pid + "'";
        try {
            dh.runSQL(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                
        return false;
    }
    
    public ArrayList<Product> getListProductsByCategoryId(String cid) {
        String sql = "SELECT * FROM Product WHERE Product.category_id='"+ cid + "'";

        try {
            ArrayList<Product> listProduct = new ArrayList<>();

            ResultSet rs = dh.getData(sql);
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getString(1));
                product.setName(rs.getString(2));
                product.setPrice(rs.getFloat(3));
                product.setQuantity(rs.getInt(4));
                product.setDescription(rs.getString(5));
                product.setImage(rs.getString(6));
                product.setLastUpdate(rs.getDate(7));
                product.setCategoryId(cid);
                
                listProduct.add(product);
            }

            return listProduct;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<Product> getProductsLike(String sfirst) {
        String sql = "SELECT * FROM Product WHERE product_id LIKE '" + sfirst + "%'";
        ArrayList<Product> list = new ArrayList<>();
        try {
            ResultSet rs = dh.getData(sql);
            while (rs.next()) {
                Product p = new Product(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), 
                        rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8));
                list.add(p);
            }
            return list;
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Product getProductById(String pid) {
        String sql = "SELECT * FROM Product WHERE product_id='" + pid + "'";
        try {
            ResultSet rs = dh.getData(sql);
            if (rs.next()) {
                Product p = new Product(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), 
                        rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8));
                return p;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<Product> getAllProducts() {
        String sql = "SELECT * FROM Product";
        try {
            ResultSet rs = dh.getData(sql);
            ArrayList<Product> list = new ArrayList<>();
            while (rs.next()) {
                Product p = new Product(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), 
                        rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8));
                list.add(p);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
