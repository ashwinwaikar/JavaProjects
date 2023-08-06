import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "root");

			conn.setAutoCommit(false);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter From Account id:");
			int f_id = Integer.parseInt(br.readLine());
			System.out.println("Enter To Account id:");
			int t_id = Integer.parseInt(br.readLine());
			System.out.println("Enter Amount:");
			int amt = Integer.parseInt(br.readLine());

			PreparedStatement pstmt1 = conn.prepareStatement("update account set amount=amount+? where id=?");
			PreparedStatement pstmt2 = conn.prepareStatement("update account set amount=amount-? where id=?");

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select amount from account where id=" + f_id);

			int avlbal = 0;
			if (rs.next()) {
				avlbal = rs.getInt("amount");
			}
			if (avlbal > amt) {
				pstmt1.setInt(1, amt);
				pstmt1.setInt(2, t_id);
				pstmt1.executeUpdate();
//				int i = 4 / 0;// IF any Exception Occurs
				pstmt2.setInt(1, amt);
				pstmt2.setInt(2, f_id);
				pstmt2.executeUpdate();

				conn.commit();
			} else {
				System.out.println("Sorry!You dont have sufficient Balalance");
			}
		} catch (Exception e) {
			try {

				System.out.println(e);
				System.out.println("Rolling Back.....");
				conn.rollback();
			} catch (Exception e1) {
				System.out.println(e1);
			} finally {
				try {
					conn.close();
				} catch (Exception e3) {
					System.out.println(e3);
				}
			}
		}
	}
}