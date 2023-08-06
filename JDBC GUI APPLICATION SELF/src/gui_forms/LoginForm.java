package gui_forms;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import listeners.LoginListener;

public class LoginForm {

	public JFrame frame;
	public JButton login, cancel, newuser;
	public JTextField textField1, textField2;
	public JLabel label1, label2;

	public LoginForm() {
		frame = new JFrame("Login");
		frame.setSize(300, 300);
		frame.setVisible(true);

		login = new JButton("LOGIN");
		cancel = new JButton("CANCEL");
		newuser = new JButton("CLICKHERE FOR NEW USER");

		textField1 = new JTextField(10);
		textField2 = new JTextField(10);

		label1 = new JLabel("Enter your UserName");
		label2 = new JLabel("Enter your Password");

		frame.setLayout(new FlowLayout());

		frame.add(label1);
		frame.add(textField1);
		frame.add(label2);
		frame.add(textField2);

		frame.add(login);
		frame.add(cancel);
		frame.add(newuser);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		LoginListener l = new LoginListener(this);

		login.addActionListener(l);
		cancel.addActionListener(l);
		newuser.addActionListener(l);
	}

}
