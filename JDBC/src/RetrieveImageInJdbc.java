import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveImageInJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "root");

			PreparedStatement ps = conn.prepareStatement("select * from imgtable");

			ResultSet rs = ps.executeQuery();
			rs.next();

			Blob b = rs.getBlob(2);
			byte barr[] = new byte[(int) b.length()];// an array is created of same size as Blob but contains no data
			barr = b.getBytes(1, (int) b.length());// passing starting index and ending index of the Blob to get total
													// byte data of Blob and then stored in barr

			String file = System.getProperty("user.dir");
//			System.out.println(file);
			file = file + "\\src\\b.jpg";

			FileOutputStream fos = new FileOutputStream(file);
			fos.write(barr);

			fos.close();

			System.out.println("OK");

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
