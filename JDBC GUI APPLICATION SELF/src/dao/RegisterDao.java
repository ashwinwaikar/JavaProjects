package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import beans.LoginBean;
import beans.RegisterBean;
import databaseconnection.ConnectionProvider;

public class RegisterDao {

	public String userRegister(RegisterBean rBean) {

		try {
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?)");
			ps.setString(1, rBean.getName());
			ps.setString(2, rBean.getPass());
			ps.setString(3, rBean.getEmail());
			ps.setString(4, rBean.getMobile());

			int i = ps.executeUpdate();
			if (i > 0) {
				return "successfully registered";
			} else {
				return "failed";
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return "failed";
	}

}