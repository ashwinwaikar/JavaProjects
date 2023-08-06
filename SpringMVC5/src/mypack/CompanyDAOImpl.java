package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CompanyDAOImpl implements CompanyDAO 
{
	@Autowired
	private HibernateTemplate template;

	@Override
	public List<?> getAllCompanies() {
		// TODO Auto-generated method stub
		return  template.find("from Company");
	}

	@Override
	public void delete(int cid) {
		template.delete(template.get(Company.class,cid));
		
	}
	
	

}







