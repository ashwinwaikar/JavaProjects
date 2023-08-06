package pack1;

import java.util.Scanner;

/*5) accept two numbers and check whether first number is greater or second number is greater or they are equal.
*/
public class Five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " " + "is Greater than" + " " + b);
		} else if (a < b) {
			System.out.println(a + " " + "is Smaller than" + " " + b);
		} else {
			System.out.println("Both Numbers are Equal");
		}
	}

}
