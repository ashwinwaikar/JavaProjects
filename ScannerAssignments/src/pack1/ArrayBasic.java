package pack1;

import java.util.Scanner;

//8) create int array of 5 elements and accept 5 values inside it. Now display all the numbers of array.
public class ArrayBasic {

	public static void main(String[] args) {
		int arr[] = new int[5];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int no;
		for (int i = 0; i < arr.length; i++) {
			no = sc.nextInt();
			arr[i] = no;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
