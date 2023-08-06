package pack1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Que3 {

	public static void removeDuplicates(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

		System.out.print(set);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element");
			arr[i] = sc.nextInt();
		}

		removeDuplicates(arr);
	}

}
