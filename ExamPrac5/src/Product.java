import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product implements Serializable {

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param qty
	 */
	public Product(int id, String name, int price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	private int id;
	private String name;
	private int price;
	private int qty;

	public void disp() {
		System.out.println(id + " " + name + " " + " " + price + " " + " " + qty);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}

	public static void main(String[] args) {

		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Santoor", 154, 5));
		list.add(new Product(2, "Jam", 124, 7));
		list.add(new Product(3, "Butter", 127, 6));
		list.add(new Product(4, "Soncake", 185, 4));
		try {
			FileOutputStream fos = new FileOutputStream("D:\\VITA E-DAC\\Java\\Core java\\1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);

			FileInputStream fis = new FileInputStream("D:\\VITA E-DAC\\Java\\Core java\\1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			ArrayList list2 = (ArrayList) ois.readObject();
			// System.out.println(list2);

			/*
			 * Product p1 = (Product) list2.get(0); Product p2 = (Product) list2.get(1);
			 * Product p3 = (Product) list2.get(2); Product p4 = (Product) list2.get(3);
			 * 
			 * p1.disp(); p2.disp(); p3.disp(); p4.disp();
			 * 
			 */
			Iterator itr = list2.iterator();
			while (itr.hasNext()) {
				Product p = (Product) itr.next();
				p.disp();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
