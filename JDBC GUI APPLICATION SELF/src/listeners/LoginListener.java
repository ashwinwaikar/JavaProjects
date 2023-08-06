package listeners;

import gui_forms.LoginForm;
import gui_forms.RegisterForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import beans.LoginBean;
import dao.LoginDao;

public class LoginListener implements ActionListener {
	LoginForm loginform;

	public LoginListener(LoginForm loginform) {
		this.loginform = loginform;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginform.login) {
			String name = loginform.textField1.getText();
			String pass = loginform.textField2.getText();

			LoginBean loginBean = new LoginBean(name, pass);

			LoginDao dao = new LoginDao();
			dao.userLogin(loginBean);
		} else if (e.getSource() == loginform.newuser) {
			RegisterForm r = new RegisterForm();

		} else if (e.getSource() == loginform.cancel) {
			loginform.textField1.setText("");
			loginform.textField2.setText("");
		}
	}
}