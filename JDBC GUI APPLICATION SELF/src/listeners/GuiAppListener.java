package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui_forms.GuiApp;
import gui_forms.LoginForm;

public class GuiAppListener implements ActionListener {
	GuiApp guiApp;

	public GuiAppListener(GuiApp guiApp) {
		this.guiApp = guiApp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
//		System.out.println(o);
		if (o == guiApp.login) {
			LoginForm l = new LoginForm();
		} else if (o == guiApp.update) {
			System.out.println("Update");
		} else if (o == guiApp.delete) {
			System.out.println("Delete");
		} else if (o == guiApp.select) {
			System.out.println("Select");
		}
	}

}
