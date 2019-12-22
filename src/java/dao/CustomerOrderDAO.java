package dao;

import dbhandle.DatabaseHandle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CustomerOrder;

/**
 *
 * @author Lee Nguyen
 */
public class CustomerOrderDAO implements InterfaceDAO {
    private static DatabaseHandle dh = DatabaseHandle.getInstance();
    
    @Override
    public boolean add(Object obj) {
        CustomerOrder co = (CustomerOrder) obj;
        String sql = "INSERT INTO Customer_order VALUES (?, ?, ?, ?)";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, co.getAmount());
            pstm.setString(2, co.getDateCreate().toString());
            pstm.setLong(3, co.getConfirmationNumber());
            pstm.setInt(4, co.getCustomerId());
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    @Override
    public boolean update(Object obj) {
        CustomerOrder co = (CustomerOrder) obj;
        String sql = "UPDATE Customer_order SET amount=?, date_create=?, confirmation_number=?,"
                + "customer_id=? WHERE order_id=?";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, co.getAmount());
            pstm.setString(2, co.getDateCreate().toString());
            pstm.setLong(3, co.getConfirmationNumber());
            pstm.setInt(4, co.getCustomerId());
            pstm.setInt(5, co.getOrderId());
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    @Override
    public boolean delete(Object obj) {
        CustomerOrder co = (CustomerOrder) obj;
        String sql = "DELETE FROM Customer_order WHERE order_id=" + co.getOrderId();
        try {
            dh.runSQL(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public ArrayList<CustomerOrder> getAllOrders() {
        String sql = "SELECT * FROM CustomerOrder";
        ArrayList<CustomerOrder> listOrders = new ArrayList<>();
        try {
            ResultSet rs = dh.getData(sql);
            while (rs.next()) {
                CustomerOrder co = new CustomerOrder(rs.getInt(1), rs.getFloat(2), rs.getDate(3), rs.getLong(4), rs.getInt(5));
                listOrders.add(co);
            }
            return listOrders;
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
    
    public CustomerOrder getCustomerOrderById(int coid) {
        String sql = "SELECT * FROM CustomerOrder WHERE order_id=" + coid;
        try {
            ResultSet rs = dh.getData(sql);
            CustomerOrder co = new CustomerOrder(rs.getInt(1), rs.getFloat(2), rs.getDate(3), rs.getLong(4), rs.getInt(5));
            return co;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
