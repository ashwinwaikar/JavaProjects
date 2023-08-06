package pack1;

import java.util.Scanner;

/*
14) Create jagged array. accept number of rows and differnt number of cols for different rows.
then accept numbers to be stored inside this array and display the array.
*/
public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Rows");
		int row = sc.nextInt();

		int arr[][] = new int[row][];

		int col = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number of Columns inside the array for " + i + " Element");
			col = sc.nextInt();
			arr[i] = new int[col];
		}
		//
		System.out.println("Enter the values which you want to enter inside an array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("Contents of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
