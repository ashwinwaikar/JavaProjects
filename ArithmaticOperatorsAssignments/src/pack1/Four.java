package pack1;

import java.util.Scanner;

/*4) accept two numbers and divide them.*/
public class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers For Division");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = a / b;
		System.out.println("DIVISION OF TWO ENTERED NUMBERS IS" + " " + c);
	}

}
