package pack1;
//7) accept a number and display whether it is even , odd or zero.
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if (no == 0) {
			System.out.println("Entered number is 0");
		}
		if (no % 2 == 0) {
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");
		}
	}

}
