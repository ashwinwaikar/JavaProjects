/**
 * 
 */
package emppack;

/**
 * @author ASHWIN WAIKAR
 *
 */
public class Employee {
	private String name, desig;
	private double salary;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the desig
	 */
	public String getDesig() {
		return desig;
	}

	/**
	 * @param desig
	 *            the desig to set
	 */
	public void setDesig(String desig) {
		this.desig = desig;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		System.out.println("I am def const");
	}

	public Employee(String name, String desig, double salary) {
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}

}
