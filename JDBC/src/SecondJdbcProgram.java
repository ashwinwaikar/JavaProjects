import java.sql.*;

public class SecondJdbcProgram {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/androjavatech4u", "root", "root");
			System.out.println(con);

			PreparedStatement st = con.prepareStatement("insert into user values(?,?)");
			st.setString(1, "Karan");
			st.setInt(2, 2323);

			int i = st.executeUpdate();

			if (i > 0) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Something went wrong");
			}

			ResultSet rs = st.executeQuery("select *from user");
			while (rs.next()) {
				System.out.println(rs.getString("NAME"));
				System.out.println(rs.getInt("ID"));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
		}
	}
}