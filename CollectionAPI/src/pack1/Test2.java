package pack1;

import java.util.LinkedList;
import java.util.ListIterator;

/*2)create LinkedList with the values 10,20,30 and 40.
  	display it.
	now insert 500 in the beginning.
	insert 400 at 2nd position.
	add 1000 at the end.
	display the list again.
*/
public class Test2 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		ListIterator<Integer> ltr1 = l.listIterator();
		while (ltr1.hasNext()) {
			System.out.println(ltr1.next());
		}

		l.addFirst(500);
		l.add(2, 400);
		l.addLast(1000);
		System.out.println("After modifying");
		ListIterator<Integer> ltr2 = l.listIterator();
		while (ltr2.hasNext()) {
			System.out.println(ltr2.next());
		}
	}

}
