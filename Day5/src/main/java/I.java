import java.sql.*;

public class I {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/day5";
        String user = "root";
        String password = "Shiv@2004";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            CallableStatement cs = conn.prepareCall("{ call getStudentById(?) }");
            cs.setInt(1, 3);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }

            Statement stmt = conn.createStatement();
            ResultSet all = stmt.executeQuery("SELECT * FROM students");
            while (all.next()) {
                System.out.println(all.getInt(1) + " " + all.getString(2) + " " + all.getInt(3));
            }

        } catch (SQLException e) {
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}

