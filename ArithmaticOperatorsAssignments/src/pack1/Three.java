package pack1;

import java.util.Scanner;

/*3) accept two numbers and multiply them.*/
public class Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers For MULTIPLICATIOIN");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("MULTIPLICATION OF TWO ENTERED NUMBERS IS" + " " + c);
	}

}
