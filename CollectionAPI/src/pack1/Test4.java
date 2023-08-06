package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*4)create a class "MyClass".
	create 5 different objects of it.
	add them in a ArrayList.
	store ArrayList in file.
	Now open a file, read ArrayList and display all objects.*/

class MyClass implements Serializable {
	int num;

	public MyClass(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "" + num;
	}
}

public class Test4 {

	public static void main(String[] args) {
		List<MyClass> list = new ArrayList<MyClass>();

		MyClass m1 = new MyClass(5);
		MyClass m2 = new MyClass(40);
		MyClass m3 = new MyClass(15);
		MyClass m4 = new MyClass(52);
		MyClass m5 = new MyClass(30);

		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		try {
			System.out.println("list before serializing " + list);
			System.out.println("Serializing all the objects at a time by serializing 'ArrayList' class object");
			FileOutputStream fos = new FileOutputStream(
					"D:\\VITA E-DAC\\Java\\Day_11\\Generics_and_Collection\\CollectionApiAssignments\\one.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);

			System.out.println("DeSerializing all the objects at a time by Deserializing 'ArrayList' class object");
			FileInputStream fis = new FileInputStream(
					"D:\\VITA E-DAC\\Java\\Day_11\\Generics_and_Collection\\CollectionApiAssignments\\one.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List list2 = (List) ois.readObject();

			System.out.println("list after deserializing ");
			System.out.println(list2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
