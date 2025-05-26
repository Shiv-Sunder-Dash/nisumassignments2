import java.sql.*;

public class G {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/day5";
        String user = "root";
        String password = "Shiv@2004";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM students WHERE id = 10");
            stmt.executeUpdate("INSERT INTO students VALUES (10, 'Ramesh', 25)");

            String search = "SELECT * FROM students WHERE name LIKE ?";
            try (PreparedStatement ps = conn.prepareStatement(search)) {
                ps.setString(1, "Ra%");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
                }
            }

            System.out.println("Full table:");
            ResultSet all = stmt.executeQuery("SELECT * FROM students");
            while (all.next()) {
                System.out.println(all.getInt("id") + " " + all.getString("name") + " " + all.getInt("age"));
            }

        } catch (SQLException e) {
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}

