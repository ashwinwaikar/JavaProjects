package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class DeptDAOImpl implements DeptDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public List<?> getDepartments(String location) {
		return template.find("from Department d where d.location=?", location);

	}

}
