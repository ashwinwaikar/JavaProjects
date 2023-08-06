package mypack;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void add(Product ref) {
		template.save(ref);
	}

	@Override
	public List<?> getProducts() {
		return template.find("from Product");

	}

}
