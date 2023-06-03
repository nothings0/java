
package DAL;
import java.sql.*;

public class DbContext {
    protected Connection conn;

    public DbContext() {
        try {
            String user = "sa";
            String pass = "123456";
            String url = "jdbc:sqlserver://DESKTOP-5FAEFGD\\SQLEXPRESS:1433;databaseName=CSDL_BanHang;encrypt=true;trustServerCertificate=true;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("ket noi thanh cong");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connect faild!");
            throw new RuntimeException(e);
        }
    }
    
}
