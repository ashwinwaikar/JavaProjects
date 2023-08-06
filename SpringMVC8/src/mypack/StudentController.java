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
public class StudentController {
	@Autowired
	StudentDAO dao;

	@GetMapping("new_student")
	public ModelAndView before() {
		Student s = new Student();
		return new ModelAndView("stud", "mystudent", s);
	}

	@PostMapping("new_student")
	public String afterSubmit(@Valid @ModelAttribute("mystudent") Student student1, BindingResult result) {
		if (result.hasFieldErrors()) {
			return "stud";
		}
		dao.add(student1);
		return "success";
	}
}
