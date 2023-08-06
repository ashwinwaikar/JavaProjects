package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*1) 	create a table "Student"
		rollno,name,age
		write a java program to accept rollno,name,age from user and insert a row.
		after inserting that row try to view using a query.

*/
public class Test1 {

	public static void main(String[] args) {

		String ss = "jdbc:mysql://localhost:3306/userdb1";

		try (Connection conn = DriverManager.getConnection(ss, "root", "root")) {
			System.out.println("Implementation class is\t" + conn.getClass());
			System.out.println(conn);

			PreparedStatement st = conn.prepareStatement("insert into Student (rollno,name,age) values(?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Rollno,Name and Age");
			int a = sc.nextInt();
			String b = sc.next();
			int c = sc.nextInt();
			st.setInt(1, a);
			st.setString(2, b);
			st.setInt(3, c);

			long i = st.executeUpdate();
			if (i > 0) {
				System.out.println("Record inserted Successfully");
			} else {
				System.out.println("Record not inserted");
			}

			ResultSet rs = st.executeQuery("select * from Student");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
