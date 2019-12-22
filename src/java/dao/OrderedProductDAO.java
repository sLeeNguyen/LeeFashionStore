package dao;

import dbhandle.DatabaseHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OrderedProduct;

/**
 *
 * @author Lee Nguyen
 */
public class OrderedProductDAO implements InterfaceDAO {
    private static DatabaseHandle dh = DatabaseHandle.getInstance();
    
    public boolean add(int orderId, String productId, int quantity) {
        String sql = "INSERT INTO Ordered_product VALUES (" + orderId + ", " + productId + ", " + quantity + ")";
        try {
            dh.runSQL(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OrderedProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    @Override
    public boolean update(Object obj) {
        return false;
    }
    
    @Override
    public boolean delete(Object obj) {
        return false;
    }
    
    public ArrayList<OrderedProduct> getAllOrders() {
        String sql = "SELECT * FROM OrderedProduct";
        ArrayList<OrderedProduct> listOrders = new ArrayList<>();
        try {
            ResultSet rs = dh.getData(sql);
            while (rs.next()) {
                OrderedProduct co = new OrderedProduct(rs.getInt(1), rs.getString(2), rs.getInt(3));
                listOrders.add(co);
            }
            return listOrders;
            
        } catch (SQLException ex) {
            Logger.getLogger(OrderedProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
    public OrderedProduct getOrderById(int coid) {
        String sql = "SELECT * FROM CustomerOrder WHERE order_id=" + coid;
        try {
            ResultSet rs = dh.getData(sql);
            OrderedProduct cp = new OrderedProduct(rs.getInt(1), rs.getString(2), rs.getInt(3));
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(OrderedProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
