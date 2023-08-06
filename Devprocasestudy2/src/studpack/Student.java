/**
 * 
 */
package studpack;

/**
 * @author ASHWIN WAIKAR
 *
 */
public class Student {

	private String name;
	private String address;
	private int age;

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Default/No arg constructor
	 */

	public Student() {
		System.out.println("This is def const");
	}

	/**
	 * @param name
	 * @param address
	 * @param age
	 */
	public Student(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

}
