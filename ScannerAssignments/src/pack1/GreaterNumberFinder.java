package pack1;

import java.util.Scanner;

/*12) accept 2 numbers and display whether
	a) first number is greater
	b) second number is greater
	c) both are equal*/
public class GreaterNumberFinder {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();

		if (no1 > no2) {
			System.out.println("Number 1 is Greater");
		} else if (no2 > no1) {
			System.out.println("Number 2 is Greater");
		} else {
			System.out.println("Both Numbers are Equal");
		}

	}

}
