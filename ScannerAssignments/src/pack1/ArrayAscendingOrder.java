package pack1;

import java.util.Scanner;

//11) accept 5 numbers in an array and sort them in ascending order.
public class ArrayAscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers");
		int no;
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			no = sc.nextInt();
			arr[i] = no;
		}
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Ascending Order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

}
