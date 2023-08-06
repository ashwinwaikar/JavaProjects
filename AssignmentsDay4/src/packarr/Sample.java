package packarr;

import java.util.Arrays;

//1) initialize a single dimension array and 
//sort it in ascending order.

public class Sample {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 5;
		arr[1] = 15;
		arr[2] = 115;
		arr[3] = 45;
		arr[4] = 215;
		System.out.println("Array before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Arrays.sort(arr);

		System.out.println("Array after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
