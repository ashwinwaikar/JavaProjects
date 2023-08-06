import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreFileInDatabase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "root");

			PreparedStatement ps = conn.prepareStatement("insert into filetable values(?,?)");

			String file = System.getProperty("user.dir");
//System.out.println(file);
			file = file + "\\src\\ResultsetMetaDataANDDatabaseMetaData.java";

			File f = new File(file);

			FileReader fr = new FileReader(f);

			ps.setInt(1, 100);
			ps.setCharacterStream(2, fr, (int) f.length());

			int i = ps.executeUpdate();

			System.out.println(i + " record affected");

			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
