package pack1;

public class LoginBean {
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validate(String login, String password) {
		if (login.equalsIgnoreCase("ashwinwaikar1009") && password.equals("kadarkhan")) {
			return true;
		} else {
			return false;
		}

	}
}
