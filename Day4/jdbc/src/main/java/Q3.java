import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q3 {
    public boolean insertStudent(Student s) {
        String sql = "INSERT INTO students VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Q1.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail());
            ps.setDate(4, s.getDob());
            ps.setString(5, s.getMajor());
            ps.setDate(6, s.getAdmissionDate());
            ps.setDouble(7, s.getGpa());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateStudent(Student s) {
        String sql = "UPDATE students SET name=?, email=?, date_of_birth=?, major=?, admission_date=?, gpa=? WHERE id=?";
        try (Connection con = Q1.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setDate(3, s.getDob());
            ps.setString(4, s.getMajor());
            ps.setDate(5, s.getAdmissionDate());
            ps.setDouble(6, s.getGpa());
            ps.setInt(7, s.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id=?";
        try (Connection con = Q1.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
