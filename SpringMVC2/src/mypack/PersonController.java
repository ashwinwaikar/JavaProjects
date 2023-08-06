package mypack;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

	@GetMapping("person")
	public ModelAndView before() {
		Person p=new Person();
		
		return new ModelAndView("person","myperson",p);
		
	}

	@PostMapping("person")
	public String afterSubmit(@ModelAttribute("mb") Person p2,HttpSession session ) {
	System.out.println("inside afterSubmit\t" + p2);
	session.setAttribute("val", "1009");
	return "view";
}
}