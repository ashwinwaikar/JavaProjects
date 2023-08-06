import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImageInJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "root");

			PreparedStatement ps = conn.prepareStatement("insert into imgtable values(?,?)");

			String file = System.getProperty("user.dir");
//			System.out.println(file);
			file = file + "\\src\\a.jpg";

			FileInputStream fis = new FileInputStream(file);

			ps.setString(1, "img");
			ps.setBinaryStream(2, fis, fis.available());

			int i = ps.executeUpdate();

			System.out.println(i + "Img is stored succesfully...");

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
