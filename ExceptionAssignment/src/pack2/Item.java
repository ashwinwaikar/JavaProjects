package pack2;

/*4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
member function ->void display()
which will display all the details of product
create instances of this class and call the method display.*/

public class Item {
	String itemid;
	String name;
	int cost;

	void display() {
		System.out.println(itemid);
		System.out.println(name);
		System.out.println(cost);
	}

	public Item(String itemid, String name, int cost) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}

	public static void main(String[] args) {
		Item i1 = new Item("ash1009", "Ashwin Waikar", 50000);
		i1.display();

		Item i2 = new Item("parag8362", "Sanket Jaiswal", 52420);
		i2.display();
	}

}
