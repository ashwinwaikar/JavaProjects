package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void add(Person ref) {
		template.save(ref);
	}

}
