package mypack;

import javax.validation.Valid;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	LoginDAO ldao;

	@GetMapping("loginkaro")
	public ModelAndView before() {
		System.out.println("aaya");
		Login l1 = new Login();
		return new ModelAndView("login", "mylogin", l1);

	}

	@PostMapping("loginkaro")
	public String afterSubmit(@Valid @ModelAttribute("mylogin") Login l2, BindingResult result) {
		if (result.hasFieldErrors()) {
			return "login";
		}
		ldao.add(l2);
		return "success";
	}

}