package pack1;

import java.util.Scanner;

/*13) create two dimension array of int. accept how many rows and cols from user.
also accept numbers to be stored in the array from user.*/
public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows); and cols");
		int row = sc.nextInt();

		System.out.println("Enter number of rows");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		System.out.println("Enter the Values");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
