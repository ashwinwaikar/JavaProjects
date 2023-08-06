/**
 * 
 */
package clientpro;

import emppack1.*;

/**
 * @author ASW
 *
 */
public class ClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Asw");
		e.setSalary(1200000);
		e.setDesig("Software Engg");

		System.out.println(e.getDesig());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

		Employee e1 = new Employee("pratik", "bhikari", 98765);
		System.out.println(e1.getDesig());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
	}

}
