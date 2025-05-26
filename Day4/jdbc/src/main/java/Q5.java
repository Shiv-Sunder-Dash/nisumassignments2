import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public List<CourseInfo> getCoursesByStudent(int studentId) {
        List<CourseInfo> list = new ArrayList<>();
        String query = "SELECT c.course_name, c.instructor, e.grade " +
                "FROM enrollments e " +
                "JOIN courses c ON e.course_id = c.id " +
                "WHERE e.student_id = ?";
        try (Connection con = Q1.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new CourseInfo(
                        rs.getString("course_name"),
                        rs.getString("instructor"),
                        rs.getString("grade")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
