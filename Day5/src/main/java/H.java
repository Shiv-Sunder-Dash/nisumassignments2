import java.sql.*;

public class H {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/day5";
        String user = "root";
        String password = "Shiv@2004";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false);

            try {
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS marks(student_id INT, subject VARCHAR(50), marks INT)");

                PreparedStatement ps1 = conn.prepareStatement("INSERT INTO students VALUES (?, ?, ?)");
                ps1.setInt(1, 3);
                ps1.setString(2, "Suresh");
                ps1.setInt(3, 22);
                ps1.executeUpdate();

                PreparedStatement ps2 = conn.prepareStatement("INSERT INTO marks VALUES (?, ?, ?)");
                ps2.setInt(1, 3);
                ps2.setString(2, "Math");
                ps2.setInt(3, 90);
                ps2.executeUpdate();

                conn.commit();
                System.out.println("Transaction committed.");
            } catch (SQLException ex) {
                conn.rollback();
                System.out.println("Transaction rolled back.");
            }

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

        } catch (SQLException e) {
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}

