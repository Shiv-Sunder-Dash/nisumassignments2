import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q4 {
    public boolean transferCredits(int fromId, int toId, double credits) {
        String deduct = "UPDATE students SET gpa = gpa - ? WHERE id = ?";
        String add = "UPDATE students SET gpa = gpa + ? WHERE id = ?";
        try (Connection con = Q1.getConnection()) {
            con.setAutoCommit(false);
            try (PreparedStatement ps1 = con.prepareStatement(deduct);
                 PreparedStatement ps2 = con.prepareStatement(add)) {
                ps1.setDouble(1, credits);
                ps1.setInt(2, fromId);

                ps2.setDouble(1, credits);
                ps2.setInt(2, toId);

                ps1.executeUpdate();
                ps2.executeUpdate();

                con.commit();
                return true;
            } catch (SQLException e) {
                con.rollback();
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
