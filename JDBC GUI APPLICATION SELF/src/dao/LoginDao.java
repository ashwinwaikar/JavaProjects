package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import beans.LoginBean;
import databaseconnection.ConnectionProvider;

public class LoginDao {

	public void userLogin(LoginBean loginBean) {

		try {
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where name=? and pass=?");
			ps.setString(1, loginBean.getUsername());
			ps.setString(2, loginBean.getPassword());

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("VALID USER");
			} else {

				System.out.println("INVALID USER");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}