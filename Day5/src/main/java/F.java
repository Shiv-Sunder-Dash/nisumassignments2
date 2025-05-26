import java.sql.*;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/day5";
        String user = "root";
        String password = "Shiv@2004";

        try (Scanner sc = new Scanner(System.in);
             Connection conn = DriverManager.getConnection(url, user, password)) {

            System.out.print("Enter student ID to delete: ");
            int idToDelete = sc.nextInt();

            String delete = "DELETE FROM students WHERE id = ?";
            try (PreparedStatement ps = conn.prepareStatement(delete)) {
                ps.setInt(1, idToDelete);
                ps.executeUpdate();
                System.out.println("Record deleted if ID existed.");
            }

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }

        } catch (SQLException e) {
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}


