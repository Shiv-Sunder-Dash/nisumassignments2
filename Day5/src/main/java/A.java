import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/day5";
        String user = "root";
        String password = "Shiv@2004";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connection successful!");
            } else {
                System.out.println("Connection failed.");
            }
        } catch (SQLException e) {
            System.out.println("Connection error:");
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
