/**
 * 
 */
package emppack1;

/**
 * @author ASW
 *
 */
public class Employee {

	/**
	 * 
	 */
	private String name, desig;
	private double salary;

	public Employee() {

	}

	/**
	 * @param name
	 * @param desig
	 * @param salary
	 */
	public Employee(String name, String desig, double salary) {
		super();
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
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
	 * @param desig the desig to set
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
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
