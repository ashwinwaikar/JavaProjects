package mypack;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void add(Login ref) {
		template.save(ref);
	}

}
