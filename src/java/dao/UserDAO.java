package dao;

import dbhandle.DatabaseHandle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.User;
import java.util.ArrayList;

/**
 *
 * @author Lee Nguyen
 */
public class UserDAO implements InterfaceDAO {
    private static DatabaseHandle dh = DatabaseHandle.getInstance();
    
    @Override
    public boolean add(Object obj) {
        User user = (User) obj;
        String sql = "INSERT INTO Users VALUES (?, ?, ?, ?, ?, ?)";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getUsername());
            pstm.setString(2, user.getPassword());
            pstm.setString(3, user.getEmail());
            pstm.setNString(4, user.getFullname());
            pstm.setNString(5, user.getAddress());
            pstm.setString(6, user.getRole());
            pstm.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public boolean update(Object obj) {
        User user = (User) obj;
        String sql = "UPDATE Users SET user_name=?, password=?, email=?, full_name=?, address=?, role=?"
                + "WHERE user_id=?";
        Connection conn = dh.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getUsername());
            pstm.setString(2, user.getPassword());
            pstm.setString(3, user.getEmail());
            pstm.setNString(4, user.getFullname());
            pstm.setNString(5, user.getAddress());
            pstm.setString(6, "user");
            pstm.setInt(7, user.getUserId());
            pstm.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;        
    }
    
    @Override
    public boolean delete(Object obj) {
        User user = (User) obj;
        String sql = "DELETE FROM Users where user_id=" + user.getUserId();
        try {
            dh.runSQL(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;        
    }
    
    public ArrayList<User> getAllUsers() {
        String sql = "SELECT * FROM Users";
        ArrayList<User> listUsers = new ArrayList<>();
        
        try {
            ResultSet rs = dh.getData(sql);
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                listUsers.add(user);
            }
            return listUsers;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
    public User getUserById(int uid) {
        String sql = "SELECT * FROM Users WHERE user_id=" + uid;
        try {
            ResultSet rs = dh.getData(sql);
            if (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                return user;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public boolean checkUserExists(String username) {
        String sql = "SELECT * FROM Users WHERE user_name='" + username + "'";
        Connection conn = dh.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
