package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private HibernateTemplate template;

	@Override
	public void add(Student ref) {
		template.save(ref);

	}

}
