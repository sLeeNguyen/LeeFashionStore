package dao;

import dbhandle.DatabaseHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author Lee Nguyen
 */
public class CategoryDAO {
    private static CategoryDAO cd = null;
    private static DatabaseHandle dh = DatabaseHandle.getInstance();
    
    public ArrayList<Category> getListCategory() {
        String sql = "SELECT * FROM Category";
        ArrayList<Category> listCategory = new ArrayList<>();

        try {
            ResultSet rs = dh.getData(sql);
            
            while (rs.next()) {
                Category category = new Category(rs.getString(1), rs.getString(2), rs.getString(3));         
                listCategory.add(category);
            }
            
            return listCategory;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
    public Category getCategoryById(String cid) {
        String sql = "SELECT * FROM Category WHERE category_id='" + cid + "'";
        try {
            ResultSet rs = dh.getData(sql);
            if (rs.next()) {
                Category category = new Category(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
