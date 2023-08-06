package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@Autowired
	StudentDAO sdao;

	@GetMapping("new_student")
	public ModelAndView before() {
		Student s = new Student();
		return new ModelAndView("stud", "mystudent", s);
	}

	@PostMapping("new_student")
	public String afterSubmit(Student student1) {
		sdao.add(student1);
		return "success";
	}
}
