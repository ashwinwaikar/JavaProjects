package pack1;

import java.util.Scanner;

//10) accept 5 numbers in an array and display their sum.
public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 numbers");

		int arr[] = new int[5];

		int no;

		for (int i = 0; i < arr.length; i++) {
			no = sc.nextInt();
			arr[i] = no;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of all he elements of an arrya is " + sum);
	}

}
