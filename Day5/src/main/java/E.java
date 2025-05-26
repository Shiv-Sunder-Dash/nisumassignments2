import java.sql.*;

public class E {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/day5";
        String user = "root";
        String password = "Shiv@2004";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String update = "UPDATE students SET name = ? WHERE id = ?";
            try (PreparedStatement ps = conn.prepareStatement(update)) {
                ps.setString(1, "Ritika");
                ps.setInt(2, 1);
                ps.executeUpdate();
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
