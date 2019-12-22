package dbhandle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lee Nguyen
 */
public class DatabaseHandle {
    private static DatabaseHandle dh = null;
    private static final String url = "jdbc:sqlserver://localhost:1433; databaseName=EMarket";
    private static final String user = "sa";
    private static final String pass = "123";

    private static Connection conn = null;

    public DatabaseHandle() {
        createConnection();
    }

    void createConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        if (conn == null) {
            createConnection();
        }
        return conn;
    }

    public static DatabaseHandle getInstance() {
        if (dh == null) {
            dh = new DatabaseHandle();
        }
        return dh;
    }
    
    public static void runSQL(String sql) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
    }

    public static ResultSet getData(String sql) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        return rs;
    }    
}

