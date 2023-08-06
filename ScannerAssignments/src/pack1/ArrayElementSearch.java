package pack1;

import java.util.Scanner;

/*9) create int array of 5 elements and accept 5 values inside it. 
 * Now accept one more number and check whether that number is there inside array or not.
*/
public class ArrayElementSearch {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("Enter 5 numbers which you want to store inside array");
		for (int i = 0; i < arr.length; i++) {
			no = sc.nextInt();
			arr[i] = no;
		}

		System.out.println("Enter a number which you want to check that is it inside array");
		int find = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			if (find == arr[i]) {
				System.out.println("Yes Entered number is " + arr[i] + " which is present inside an array");
				count = 1;
				break;
			}

		if (count == 0) {
			System.out.println("No entered number is not present inside an array");
		}

	}

}
