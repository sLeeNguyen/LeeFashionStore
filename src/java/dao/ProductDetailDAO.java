/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbhandle.DatabaseHandle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ProductDetail;

/**
 *
 * @author Lee Nguyen
 */
public class ProductDetailDAO implements InterfaceDAO{
    private static DatabaseHandle dh = DatabaseHandle.getInstance();
    
    
    @Override
    public boolean add(Object obj) {
        ProductDetail pd = (ProductDetail) obj;
        String sql = "INSERT INTO ProductDetail VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = dh.getConnection();
        
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, pd.getProductId());
            pstm.setString(2, pd.getInformation());
            pstm.setString(3, pd.getSize());
            pstm.setString(4, pd.getImage1());
            pstm.setString(5, pd.getImage2());
            pstm.setString(6, pd.getImage3());
            pstm.setString(7, pd.getImage4());
            pstm.setString(8, pd.getImage5());
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean update(Object obj) {
        ProductDetail pd = (ProductDetail) obj;
        String sql = "UPDATE FROM Product_detail SET information=?, size=?, image1=?, image2=?, image3=?, image4=?, image5=?"
                + "WHERE product_id=?";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, pd.getInformation());
            pstm.setString(2, pd.getSize());
            pstm.setString(3, pd.getImage1());
            pstm.setString(4, pd.getImage2());
            pstm.setString(5, pd.getImage3());
            pstm.setString(6, pd.getImage4());
            pstm.setString(7, pd.getImage5());
            pstm.setString(8, pd.getProductId());
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public ProductDetail getProductDetailById(String pid) {
        String sql = "SELECT * FROM Product_detail WHERE product_id='" + pid + "'";
        try {
            ResultSet rs = dh.getData(sql);
            if (rs.next()) {
                ProductDetail pd = new ProductDetail(rs.getString(1), rs.getString(2), 
                rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                rs.getString(7), rs.getString(8));
                return pd;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
