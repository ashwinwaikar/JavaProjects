package pack1;

import java.util.Scanner;

/*18) accept 3 digit number and display whether it is armstrong or not.
	[ A number is called as armstrong number if sum of cubes of digits of number is equal to the number itself ]
*/
public class ArmstrongNumber {

	public static void main(String[] args) {

		int c = 0, a, temp;
		System.out.println("Enter a Number which you want to check as an Armstrong Number or Not");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		temp = no;
		while (no > 0) {
			a = no % 10;
			no = no / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
