import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public List<Product> searchProducts(String category, Double minPrice, Double maxPrice) {
        StringBuilder query = new StringBuilder("SELECT * FROM products WHERE 1=1");
        List<Object> params = new ArrayList<>();

        if (category != null) {
            query.append(" AND category = ?");
            params.add(category);
        }
        if (minPrice != null) {
            query.append(" AND price >= ?");
            params.add(minPrice);
        }
        if (maxPrice != null) {
            query.append(" AND price <= ?");
            params.add(maxPrice);
        }

        List<Product> result = new ArrayList<>();
        try (Connection con = Q1.getConnection();
             PreparedStatement ps = con.prepareStatement(query.toString())) {
            for (int i = 0; i < params.size(); i++) {
                ps.setObject(i + 1, params.get(i));
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getDouble("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
