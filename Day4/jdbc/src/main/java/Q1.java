import java.sql.Connection;
import java.sql.DriverManager;

public class Q1 {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db", "root", "Shiv@2004");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}