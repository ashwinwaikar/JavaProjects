package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductApp {
	public static Connection conn;

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(1009);
		p1.setName("Ashwin");
		p1.setPrice(150.58);
		p1.setQuantity(7);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/userdb1";
			conn = DriverManager.getConnection(url, "root", "root");

			PreparedStatement pst = conn.prepareStatement("insert into product values(?,?,?,?)");
			pst.setInt(1, p1.getId());
			pst.setString(2, p1.getName());
			pst.setDouble(3, p1.getPrice());
			pst.setInt(4, p1.getQuantity());
			int k = pst.executeUpdate();
			if (k > 0) {
				System.out.println("Record has been added");
			} else {
				System.out.println("cannot add");
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from product");

			Product p2 = new Product();
			while (rs.next()) {
				p2.setId(rs.getInt("id"));
				p2.setName(rs.getString("name"));
				p2.setPrice(rs.getDouble("price"));
				p2.setQuantity(rs.getInt("quantity"));

				System.out.println(p2);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
