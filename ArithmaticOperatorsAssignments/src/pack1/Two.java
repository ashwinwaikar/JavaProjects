package pack1;

import java.util.Scanner;

/*2) accept two numbers and subtract them.*/
public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers For Substraction");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;
		System.out.println("SUBSTRACTION OF TWO ENTERED NUMBERS IS" + " " + c);
	}

}
