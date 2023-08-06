package gui_forms;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import listeners.GuiAppListener;

public class GuiApp {

	public JFrame frame;
	public JButton login, update, delete, select;

	GuiApp() {
		frame = new JFrame("GuiApp");

		login = new JButton("LOGIN");
		update = new JButton("UPDATE");
		delete = new JButton("DELETE");
		select = new JButton("SELECT");

		frame.setLayout(new FlowLayout());

		frame.add(login);
		frame.add(update);
		frame.add(delete);
		frame.add(select);

		GuiAppListener g = new GuiAppListener(this);
		login.addActionListener(g);
		update.addActionListener(g);
		delete.addActionListener(g);
		select.addActionListener(g);

		frame.setSize(1000, 800);
		frame.setLocation(200, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GuiApp g = new GuiApp();
	}

}
