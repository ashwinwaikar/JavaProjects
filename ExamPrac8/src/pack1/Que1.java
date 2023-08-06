package pack1;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i += 2) {
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		System.out.println("swap list");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
