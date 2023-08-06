import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BatchUpdate2 {

	public static void main(String[] args) {
		try {

			Connection c = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement1 = c.prepareStatement("insert into user values(?,?,?,?,?)");
			preparedStatement1.setString(1, "Ramukaka");
			preparedStatement1.setString(2, "ramu");
			preparedStatement1.setString(3, "ramukaka@gmail.com");
			preparedStatement1.setString(4, "8308569197");
			preparedStatement1.setString(5, getSystemTime());
			preparedStatement1.addBatch();

			preparedStatement1.setString(1, "Ramukaka");
			preparedStatement1.setString(2, "ramu");
			preparedStatement1.setString(3, "ramukaka@gmail.com");
			preparedStatement1.setString(4, "8308569197");
			preparedStatement1.setString(5, getSystemTime());
			preparedStatement1.addBatch();

			preparedStatement1.setString(1, "Ramukaka");
			preparedStatement1.setString(2, "ramu");
			preparedStatement1.setString(3, "ramukaka@gmail.com");
			preparedStatement1.setString(4, "8308569197");
			preparedStatement1.setString(5, getSystemTime());
			preparedStatement1.addBatch();

			int[] i = preparedStatement1.executeBatch();
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