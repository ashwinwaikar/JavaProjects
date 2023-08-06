////Function which we stored for this particular program in jdbc is ---

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Types;

public class CallableStatementInJDBCForFunction {

	public static void main(String[] args) {
		try {

			Connection c = ConnectionProvider.getConnection();

			Statement s = c.createStatement();

			CallableStatement cs = c.prepareCall("{?=call summ1(?,?)}");

			cs.setInt(2, 10);
			cs.setInt(3, 10);
			cs.registerOutParameter(1, Types.INTEGER);

			cs.execute();

			int b = cs.getInt(1);
			System.out.println("b= " + b);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
