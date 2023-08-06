package pack1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/*8) maintain ICC ranking of at least 5 batsmen in the "HashMap".
	list should be maintain as "rank" "name"
	e.g. "1" "Rohit Sharma".
	Now ask any rank bet'n 1 to 5 from user. ( user input).
	if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.
*/

public class Test8 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Ashwin Waikar");
		m.put(2, "Sachin Tendulkar");
		m.put(3, "Rohit Sharma");
		m.put(4, "Suresh Raina");
		m.put(5, "Virat Kohli");

		System.out.println("Enter any rank between 1 to 5");
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();

		// steps---map->>set->>iterator
		// now get an Set
		Set<Entry<Integer, String>> set = m.entrySet();

		// now get an iterator
		Iterator<Entry<Integer, String>> itr = set.iterator();

		int count = 0;

		// display elements
		while (itr.hasNext()) {
			Map.Entry<Integer, String> me = (Entry<Integer, String>) itr.next();
			if (rank == me.getKey()) {
				System.out.println(me.getKey() + ":" + me.getValue());
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("Enter a valid Rank bro..");
		}
	}

}
