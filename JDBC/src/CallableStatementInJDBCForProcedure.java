
//Stored procedure which we stored for this particular program in jdbc is ---
//DELIMITER $$
//CREATE PROCEDURE mypro (IN name varchar(23),IN salary varchar(20))
//BEGIN
//insert into emp10(name,salary) values(name,salary);
//END $$
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

public class CallableStatementInJDBCForProcedure {

	public static void main(String[] args) {
		try {

			Connection c = ConnectionProvider.getConnection();

			Statement s = c.createStatement();
			CallableStatement cs = c.prepareCall("{call mypro(?,?)}");

			cs.setString(1, "Ashwin");
			cs.setInt(2, 10000);

			cs.executeUpdate();

			ResultSet rs = s.executeQuery("select *from emp10");
			while (rs.next()) {
				System.out.println("name " + rs.getString(1));
				System.out.println("salary " + rs.getString(2));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
