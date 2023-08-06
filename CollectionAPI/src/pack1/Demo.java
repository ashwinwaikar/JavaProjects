package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
create a class MyNum with
		private int num;
		parameterized constructor

	
Demo class with main
	create 4 objects of MyNum by passing different integers.
	store these 4 objects inside "ArrayList"
	and now store that ArrayList inside file system.
	
	read ArrayList from file and traverse it using Iterator.
*/
class MyNum implements Serializable {

	private int num;

	public MyNum(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "MyNum [num=" + num + "]";
	}

}

public class Demo {
	public static void main(String[] args) {

		MyNum m1 = new MyNum(100);
		MyNum m2 = new MyNum(300);
		MyNum m3 = new MyNum(200);
		MyNum m4 = new MyNum(800);
		MyNum m5 = new MyNum(700);

		List<MyNum> list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		System.out.println(list);

		try {
			FileOutputStream fos = new FileOutputStream(
					"D:\\VITA E-DAC\\Java\\Core java\\Day_11\\Generics_and_Collection\\CollectionApiAssignments\\ten.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);

			FileInputStream fis = new FileInputStream(
					"D:\\VITA E-DAC\\Java\\Core java\\Day_11\\Generics_and_Collection\\CollectionApiAssignments\\ten.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List list2 = (List) ois.readObject();

			ListIterator itr = list2.listIterator();
			while (itr.hasNext()) {

				System.out.println(itr.next().toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
