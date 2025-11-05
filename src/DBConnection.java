import java.sql.*;

public class DBConnection {
    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
              
                Class.forName("oracle.jdbc.driver.OracleDriver");

               
                con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",  
                    "system",
                    "manager"
                );
                System.out.println("Connected to Oracle Database successfully!");
            }
        } catch (Exception e) {
            System.out.println(" Database connection failed: " + e);
        }
        return con;
    }
}
