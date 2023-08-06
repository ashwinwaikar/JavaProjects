package pack1;

import java.util.Scanner;

/*
 5) accept a number and display its table using 
	while
	do... while
	for
  */
public class Table {

	public static void main(String[] args) {
		System.out.println("Enter a Number which table you want to print");
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int a = sc.nextInt();
		
		/*
		 * while(i<=10) { System.out.println(i*a); i++; }
		 */

		/*
		 * do { System.out.println(i*a); i++; }while(i<=10);
		 */

		for (i = 1; i <= 10; i++) {
			System.out.println(i * a);

		}
	}
}
