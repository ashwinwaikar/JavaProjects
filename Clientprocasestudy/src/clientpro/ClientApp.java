/*
 Author: Ashwin Waikar
Date of creation:30 may 2021
Topic:Client Developer basic program
Language Used:java using eclipse
 */
package clientpro;

import emppack.Employee;

/**
 * @author Ashwin Waikar
 *
 */
public class ClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1=new Employee("Ashwin","Software Engineer",10009.43);
		
		System.out.println(e1.getName());
		System.out.println(e1.getDesig());
		System.out.println(	e1.getSalary());
		
		Employee e2=new Employee();
		System.out.println(e2.getName());
		System.out.println(e2.getDesig());
		System.out.println(	e2.getSalary());

	}

}
