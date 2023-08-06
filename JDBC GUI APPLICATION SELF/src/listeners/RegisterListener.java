package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import beans.RegisterBean;
import dao.RegisterDao;
import gui_forms.RegisterForm;

public class RegisterListener implements ActionListener {
	RegisterForm registerForm;

	public RegisterListener(RegisterForm registerForm) {
		this.registerForm = registerForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == registerForm.register) {

			String name = registerForm.textField1.getText();
			String pass = registerForm.textField2.getText();
			String email = registerForm.textField3.getText();
			String mobile = registerForm.textField4.getText();

			if (name.equals("") || pass.equals("") || email.equals("") || mobile.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Fill All The Details");
			} else {
				RegisterBean r = new RegisterBean();
				r.setName(name);
				r.setPass(pass);
				r.setEmail(email);
				r.setMobile(mobile);

				RegisterDao registerDao = new RegisterDao();
				String msg = registerDao.userRegister(r);

				if (msg.equals("successfully registered")) {
					JOptionPane.showConfirmDialog(null, "Registered Succesfully");
				} else {
					JOptionPane.showConfirmDialog(null, "Something went wrong");

				}
			}
		}

	}

}
