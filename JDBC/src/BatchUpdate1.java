import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class BatchUpdate1 {

	public static void main(String[] args) {
		try {

			Connection c = ConnectionProvider.getConnection();

			Statement s = c.createStatement();

			String s1 = "insert into user values('karan','johar123','karan@gmail.com','12312322')";
			String s2 = "update user set name='shashank' where name='asdasd'";
			String s3 = "delete from user where name='asdsad'";

			s.addBatch(s1);
			s.addBatch(s2);
			s.addBatch(s3);

			int i[] = s.executeBatch();

			System.out.println(i.length);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getSystemTime() {
		java.util.Date date = new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss:SS");
		String strDate = formatter.format(date);
		return strDate;

	}
}