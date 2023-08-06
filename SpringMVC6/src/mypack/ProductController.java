package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	ProductDAO pdao;

	@GetMapping("add")
	public ModelAndView before() {
		Product p1 = new Product();
		return new ModelAndView("Add", "addproduct", p1);
	}

	@PostMapping("add")
	public String afterSubmit(Product ref) {
		pdao.add(ref);
		return "Home";
	}

	@GetMapping("view")
	public ModelAndView viewing() {
		List<?> mylist = pdao.getProducts();
		return new ModelAndView("Vieww", "viewproduct", mylist);
	}
}
