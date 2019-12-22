package dao;

import dbhandle.DatabaseHandle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author Lee Nguyen
 */
public class CustomerDAO implements InterfaceDAO {
    private DatabaseHandle dh = DatabaseHandle.getInstance();
    
    @Override
    public boolean add(Object obj) {
        Customer cus = (Customer) obj;
        String sql = "INSERT INTO Customer VALUES (?, ?, ?, ?, ?)";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, cus.getName());
            pstm.setString(2, cus.getPhone());
            pstm.setString(3, cus.getAddress());
            pstm.setString(4, cus.getCcNumber());
            pstm.setString(5, cus.getCityRegion());
            pstm.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public boolean update(Object obj) {
        Customer cus = (Customer) obj;
        String sql = "UPDATE FROM Customer SET name=?, phone=?, address=?, cc_number=?, city_region=? WHERE customer_id=?";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, cus.getName());
            pstm.setString(2, cus.getPhone());
            pstm.setString(3, cus.getAddress());
            pstm.setString(4, cus.getCcNumber());
            pstm.setString(5, cus.getCityRegion());
            pstm.setInt(6, cus.getCustomerId());
            pstm.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public boolean delete(Object obj) {
        Customer cus = (Customer) obj;
        String sql = "DELETE Customer where customer_id=" + cus.getCustomerId();
        try {
            dh.runSQL(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    
    public ArrayList<Customer> getAllCustomers() {
        String sql = "SELECT * FROM Customer";
        ArrayList<Customer> listCustomers = new ArrayList<>();
        try {
            ResultSet rs = dh.getData(sql);
            while (rs.next()) {
                Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5), rs.getString(6));
                listCustomers.add(customer);                
            }
            return listCustomers;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Customer getCustomerById(int cusid) {
        String sql = "SELECT * FROM Customer WHERE customer_id="+cusid;
        try {
            ResultSet rs = dh.getData(sql);
            Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5), rs.getString(6));
            return customer;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
