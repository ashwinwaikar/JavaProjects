package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*3) 
 	Define a class "Car" with
	private int id and private String modelname;
	setters and getters

	create 2 objects of Car and write them inside filesystem and thereafter read both the objects and display.
*/
class Car implements Serializable {
	private int id;
	private String modelname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

}

public class SerializationDemo3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();

		c1.setId(1009);
		c1.setModelname("Hayabusa");

		c2.setId(1999);
		c2.setModelname("Ktm Duke");

		try {
			System.out.println(c1.getId() + " " + c1.getModelname());
			System.out.println(c2.getId() + " " + c2.getModelname());

			c1.setId(500);
			c1.setModelname("Activa");

			c2.setId(400);
			c2.setModelname("Maruti");

			// Serialization Starts
			FileOutputStream fos = new FileOutputStream(
					"D:\\VITA E-DAC\\Java\\Day10\\Day_10_a\\With_Serializable\\Serializable Assignments\\third.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c1);
			oos.writeObject(c2);

			// DeSerialization Starts
			FileInputStream fis = new FileInputStream(
					"D:\\VITA E-DAC\\Java\\Day10\\Day_10_a\\With_Serializable\\Serializable Assignments\\third.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Car c3 = (Car) ois.readObject();
			Car c4 = (Car) ois.readObject();

			System.out.println(c3.getId() + " " + c3.getModelname());
			System.out.println(c4.getId() + " " + c4.getModelname());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
