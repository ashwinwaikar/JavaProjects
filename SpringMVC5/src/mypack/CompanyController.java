package mypack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CompanyController 
{
	@Autowired
	CompanyDAO cdao;
	@GetMapping("view")
	public ModelAndView show()
	{
		List<?> mylist=cdao.getAllCompanies();
		return new ModelAndView("View","mylist",mylist);
	}
	
	@GetMapping("delete")
	public String kill(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id").trim());;
		cdao.delete(id);
		return "Home";
	}
}











