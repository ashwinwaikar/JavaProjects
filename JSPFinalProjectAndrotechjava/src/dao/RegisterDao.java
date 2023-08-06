package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.RegisterBean;
import mysqlconnection.ConnectionProvider;

public class RegisterDao {
	public String save(RegisterBean bean) {
		Connection conn = null;
		try {

			conn = ConnectionProvider.factorymethod();

			PreparedStatement stmt = conn.prepareStatement("insert into register values(?,?,?,?)");
			stmt.setString(1, bean.getName());
			stmt.setString(2, bean.getPsw());
			stmt.setString(3, bean.getEmail());
			stmt.setString(4, bean.getMobile());

			int i = stmt.executeUpdate();
			if (i > 0) {
				return "success";
			} else
				return "fail";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "fail";
	}
}
