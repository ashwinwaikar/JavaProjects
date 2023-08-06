/*2) accept a number and display whether it is divisible by 7 or not.*/
package pack1;

import java.util.Scanner;

public class DivisibleBySeven {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (number % 7 == 0) {
			System.out.println("Entered Number Divisible by 7");
		} else {

			System.out.println("Entered Number Not 91Divisible by 7");
		}
	}

}
