import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveFileFromDatabase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "root");

			PreparedStatement ps = conn.prepareStatement("select * from filetable");

			ResultSet rs = ps.executeQuery();
			rs.next();

			Clob c = rs.getClob(2);
			Reader r = c.getCharacterStream();

			String file = System.getProperty("user.dir");
			// System.out.println(file);
			file = file + "\\src\\dddd.java";

			FileWriter fw = new FileWriter(file);

			int i;
			while ((i = r.read()) != -1)// here -1 means END OF FILE
			{
				fw.write((char) i);
			}

			fw.close();
			conn.close();

			System.out.println("Success!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}