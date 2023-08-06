import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class SL {

	static Stack<Integer> s = new Stack<>();
	static LinkedList<Integer> l = new LinkedList<>();

	static void addele() {
		l.add(10);
		l.add(9);
		l.add(8);
		l.add(7);
		l.add(6);
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
	}

	public static void main(String[] args) {
		SL d = new SL();
		d.addele();
		while (!l.isEmpty()) {
			s.push(l.get(0));
			l.remove(0);
		}

		while (!s.isEmpty()) {
			l.add(s.pop());

		}

			System.out.print(l);
		
	}

}
