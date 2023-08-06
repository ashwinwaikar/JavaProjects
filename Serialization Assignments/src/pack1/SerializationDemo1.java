package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*1)create a customer class with following attributes
	custid
	custname
	address
	age
create one instance of it and store it in a file. (Serialization).
now open a file, read the object and read its contents . (Deserialization)
*/
class Customer implements Serializable {
	int custid = 1009;
	String custname = "Ashwin Waikar";
	String address = "Radhkrushna Nagar,Nagpur";
	int age = 23;

}

public class SerializationDemo1 {

	public static void main(String[] args) {
		Customer c1 = new Customer();

		try {
			// Serialization Starts
			FileOutputStream fos = new FileOutputStream(
					"D:\\VITA E-DAC\\Java\\Day10\\Day_10_a\\With_Serializable\\Serializable Assignments\\one.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c1);
			System.out.println(c1.custid + " " + c1.custname + " " + c1.address + " " + c1.age);

			// DeSerialization Starts
			FileInputStream fis = new FileInputStream(
					"D:\\VITA E-DAC\\Java\\Day10\\Day_10_a\\With_Serializable\\Serializable Assignments\\one.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer c2 = (Customer) ois.readObject();
			System.out.println(c1.custid + " " + c1.custname + " " + c1.address + " " + c1.age);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
