package mypack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepartmentController {

	@Autowired
	DeptDAO ddao;

	@GetMapping("dept")
	public ModelAndView before(HttpServletRequest request) {
		// System.out.println("aaya");
		List<?> mylist = ddao.getDepartments(request.getParameter("location"));
		return new ModelAndView("Dept", "department", mylist);

	}

}
