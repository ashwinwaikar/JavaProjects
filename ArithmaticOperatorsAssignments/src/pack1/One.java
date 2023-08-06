package pack1;

import java.util.Scanner;

/*
 1) accept two numbers and add them. 
  */
public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers For Addition");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("ADDITION OF TWO ENTERED NUMBERS IS" + " " + c);
	}

}
