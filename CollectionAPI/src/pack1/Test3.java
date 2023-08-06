package pack1;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

/*3) add 5 numbers inside CopyOnWriteArrayList and 
  show how can you add one more number at the same time of traversal through its iterator.
 
*/
public class Test3 {

	public static void main(String[] args) {
		List<Integer> l = new CopyOnWriteArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers");
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			l.add(arr[i]);
		}
		System.out.println("so the Entered list is");
		System.out.println(l);

		ListIterator<Integer> ltr = l.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
			// ltr.add(1009); Exception
			l.add(4, 1009);
		}

		System.out.println("so the Final list is");
		System.out.println(l);

	}

}
