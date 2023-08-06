package pack1;

import java.util.Scanner;

/*6) accept a number and check whether it is divisible by 3 or not.
*/
public class Six {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a % 3 == 0) {
			System.out.println("Entered Number is Divisible by 3");
		} else {
			System.out.println("Entered Number is NOT Divisible by 3");

		}
	}

}
