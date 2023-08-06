package gui_forms;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import listeners.LoginListener;
import listeners.RegisterListener;

public class RegisterForm {

	public JFrame frame;
	public JButton register, clear;
	public JTextField textField1, textField3, textField4;
	public JLabel label1, label2, label3, label4;
	public JPasswordField textField2;

	public RegisterForm() {
		frame = new JFrame("Register");
		frame.setSize(300, 300);
		frame.setVisible(true);

		register = new JButton("REGISTER");
		clear = new JButton("CLEAR");
		textField1 = new JTextField(10);
//		textField2 = new JTextField(10);//normal password which display while typing
		textField2 = new JPasswordField(15);// just to hide password while typing
		textField3 = new JTextField(10);
		textField4 = new JTextField(10);

		label1 = new JLabel("Enter your UserName");
		label2 = new JLabel("Enter your Password");
		label3 = new JLabel("Enter your EMAIL");
		label4 = new JLabel("Enter your MOBILENO");

		frame.setLayout(new FlowLayout());

		frame.add(label1);
		frame.add(textField1);

		frame.add(label2);
		frame.add(textField2);

		frame.add(label3);
		frame.add(textField3);

		frame.add(label4);
		frame.add(textField4);

		frame.add(register);
		frame.add(clear);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RegisterListener r = new RegisterListener(this);

		register.addActionListener(r);
		clear.addActionListener(r);

	}

}
