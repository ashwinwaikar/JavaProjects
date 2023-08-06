package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*7)Define a class "Employee" with following members
	empid, empname, desig, basic.
	Define a parameterised constructor which will take all these values while creating an instance.
	Also define "disp()" method which will display all these details.
	create 4 employees and save them in "ArrayList".
	Now save this "ArrayList" in a file.
	Open file , read "ArrayList" , traverse ArrayList and call "disp()" for all the objects.*/

class Employee implements Serializable {
	int empid;
	String empname;
	String desig;
	int basic;

	public Employee(int empid, String empname, String desig, int basic) {
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
		this.basic = basic;
	}

	public void disp() {
		System.out.println(empid + " " + empname + " " + desig + " " + basic);
	}
}

public class Test7 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		Employee e1 = new Employee(1001, "Ashwin Waikar", "Software Developer", 501254);
		Employee e2 = new Employee(1111, "Sanket Ahuja", "Tester", 4152);
		Employee e3 = new Employee(3631, "Rasika Narayan", "Coumounder", 7458);
		Employee e4 = new Employee(2521, "Vanashree Sharma", "Designer", 100000);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		try {
			FileOutputStream fos = new FileOutputStream(
					"D:\\VITA E-DAC\\Java\\Day_11\\Generics_and_Collection\\CollectionApiAssignments\\two.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);

			FileInputStream fis = new FileInputStream(
					"D:\\VITA E-DAC\\Java\\Day_11\\Generics_and_Collection\\CollectionApiAssignments\\two.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List list2 = (List) ois.readObject();

			ListIterator itr = list2.listIterator();
			while (itr.hasNext()) {
				Employee e5 = (Employee) itr.next();
				e5.disp();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
