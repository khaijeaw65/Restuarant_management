package restuarant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestClass {

    private DatabaseConnection dc = new DatabaseConnection();

    public static void main(String[] args) {
        String id = "1";
        System.out.println(id.length());
    }
    private  static Connection getConnection(String dbName, String user, String pass) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&characterEncoding=utf-8", user, pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;

    }

}
