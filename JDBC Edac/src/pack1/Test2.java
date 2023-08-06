package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*2)create table "Employee"
	empid,empname,desig
	add 5 records manually.
	Now write a java program to accept "designation" from user and retrieve employees with the given designation.

*/
public class Test2 {
	static String ss = "jdbc:mysql://localhost:3306/userdb1";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(ss, "root", "root")) {
			System.out.println(conn);

			PreparedStatement st = conn.prepareStatement("select * from employee where desig=?");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the designation of employee");
			String s = sc.next();

			st.setString(1, s);

			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				System.out.println(a + " " + b + " " + c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}