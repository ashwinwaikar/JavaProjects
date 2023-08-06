import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultsetMetaDataANDDatabaseMetaData {

	public static void main(String[] args) {

		try {
			Connection c = ConnectionProvider.getConnection();

			DatabaseMetaData dbmd = c.getMetaData();

			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getURL());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.getTableTypes());

			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from user");
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnName(2));
			System.out.println(rsmd.getColumnType(1));
			System.out.println(rsmd.getColumnType(2));

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
