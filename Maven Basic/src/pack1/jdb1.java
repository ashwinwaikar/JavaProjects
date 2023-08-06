package pack1;

import java.sql.*;

public class jdb1 {
	public static void main(String args[]) {
		String ss = "jdbc:mysql://localhost:3306/cdac_acts_vita_database_assignment";
		try (Connection con = DriverManager.getConnection(ss, "root", "root")) {
			System.out.println("Implementation class is\t" + con.getClass());
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers");
			while (rs.next()) {
				int a = rs.getInt("cnum");
				String b = rs.getString("cname");
				String c = rs.getString("city");
				int d = rs.getInt("rating");
				int e = rs.getInt("snum");
				System.out.println(a + " " + b + " " + c + " " + d + " " + e);
			}
		} catch (Exception ee) {
			System.out.println(ee);
		}
	}
}
