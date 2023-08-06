package mypack;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

	@Autowired
	PersonManager manager;
	
	@GetMapping("person")
	public ModelAndView before() {
	Person p=new Person();
	return new ModelAndView("person","myperson",p);
	}
	
	@PostMapping
	public String afterSubmit(@Valid @ModelAttribute("myperson") Person p2,BindingResult result) {
		if(result.hasFieldErrors()) {
			return "person";
		}
		manager.add(p2);
		return "success";
	}
}
