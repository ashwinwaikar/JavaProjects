package mypack;

import java.util.List;

public interface ProductDAO {
	public void add(Product ref);

	public List<?> getProducts();
}
