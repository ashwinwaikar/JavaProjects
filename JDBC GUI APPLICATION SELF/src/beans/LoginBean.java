package beans;

public class LoginBean {

	private String username, password;

	public LoginBean(String name, String pass) {
		this.setUsername(name);
		this.setPassword(pass);

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}