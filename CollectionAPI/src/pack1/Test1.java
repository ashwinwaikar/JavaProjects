package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*1) accept 10 numbers from user and add them inside the ArrayList.
and using ListIterator display all the numbers bidirectionally.
*/
public class Test1 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 Number which you want to store inside ArrayList");
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			l.add(arr[i]);
		}
		System.out.println("so the entered list is");
		System.out.println(l);

		System.out.println("Op in Ascending order");
		ListIterator<Integer> ltr1 = l.listIterator();
		while (ltr1.hasNext()) {
			System.out.println(ltr1.next());
		}

		System.out.println("Op in Desending order");
		while (ltr1.hasPrevious()) {
			System.out.println(ltr1.previous());
		}
	}

}
