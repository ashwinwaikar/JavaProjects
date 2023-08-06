/*
 6) accept numbers and display as long as user does not enter 0.
  */
package pack1;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (true) {

			if (a != 0) {
				System.out.println(a);
				a = sc.nextInt();

			} else {
				break;
			}

		}
	}

}
