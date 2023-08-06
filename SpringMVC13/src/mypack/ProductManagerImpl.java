package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManagerImpl implements ProductManager {

	@Autowired
	ProductRepository repository;

	@Override
	public void add(Product ref) {
		repository.save(ref);
	}

	@Override
	public List<?> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
