package mypack;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookNewController {
	@GetMapping("book")
	public ModelAndView before() {
		Book defaultBook = new Book();

		return new ModelAndView("bookNew", "mybook", defaultBook);
	}

	@PostMapping("book")
	public String afterSubmit(@ModelAttribute("mb") Book book, HttpSession session) {
		// return form success view
		System.out.println("inside afterSubmit\t" + book);
		session.setAttribute("val", "1009");
		return "success";
	}
}
