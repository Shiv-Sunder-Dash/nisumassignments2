import java.sql.*;

public class D {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/day5";
        String user = "root";
        String password = "Shiv@2004";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate("DELETE FROM students WHERE id = 1");

            try (PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?, ?)")) {
                ps.setInt(1, 1);
                ps.setString(2, "Ram");
                ps.setInt(3, 23);
                ps.executeUpdate();
            }

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




