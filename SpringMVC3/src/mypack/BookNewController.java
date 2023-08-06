package mypack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class BookNewController
{
	private Book defaultBook;
	@GetMapping("book")
	public ModelAndView before()
	{
 		defaultBook=new Book();
		return new ModelAndView("bookNew","mybook",defaultBook);
	}
	
	@PostMapping("book")
	public String afterSubmit(
		@ModelAttribute("mb") Book book) 
	{
		System.out.println(defaultBook==book);
		//return form success view
		System.out.println("inside afterSubmit\t"+book);
		return "success";
	}
}
