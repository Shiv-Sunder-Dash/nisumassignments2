import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q2 {
    public Student getStudentById(int id) {
        String query = "SELECT * FROM students WHERE id=?";
        try (Connection con = Q1.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDate("date_of_birth"),
                        rs.getString("major"),
                        rs.getDate("admission_date"),
                        rs.getDouble("gpa")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}