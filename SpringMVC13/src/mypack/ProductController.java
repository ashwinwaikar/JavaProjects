package mypack;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	ProductManager manager;

	@GetMapping("add")
	public ModelAndView before() {
		Product p1 = new Product();
		System.out.println("aadddd");
		return new ModelAndView("Add", "myproduct", p1);
	}

	@PostMapping("add")
	public String afterSubmit(@Valid @ModelAttribute("myproduct") Product p2, BindingResult result) {
		if (result.hasFieldErrors()) {
			return "Add";
		}
		manager.add(p2);
		return "success";
	}

	@GetMapping("view")
	public ModelAndView show() {
		List<?> list = manager.getProducts();
		return new ModelAndView("View", "product", list);
	}
}