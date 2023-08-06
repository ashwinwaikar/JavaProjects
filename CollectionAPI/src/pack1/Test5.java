package pack1;

import java.util.*;
import java.util.Map.Entry;

/*5)create a HashMap.
	store  prn no. and students name of 10 students inside the HashMap.
	display it using iterator.
*/

public class Test5 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1001, "Ashwin Waikar");
		hm.put(1231, "Vanashree Waikar");
		hm.put(1451, "Ruchika Khan");
		hm.put(1411, "Sanket Jaiswal");
		hm.put(1651, "Shantanu Makh");
		hm.put(4156, "Yash Jaiswal");
		hm.put(8368, "Himanshu Raulkar");
		hm.put(4533, "Chetan Bawankule");
		hm.put(4563, "Dheeraj Yeole");
		hm.put(2341, "Rasika Athavale");

		// steps---map->>set->>iterator
		// now get an Set
		Set<Entry<Integer, String>> set = hm.entrySet();

		// now get an iterator
		Iterator<Entry<Integer, String>> itr = set.iterator();

		// display elements
		while (itr.hasNext()) {
			Map.Entry<Integer, String> me = (Entry<Integer, String>) itr.next();
			System.out.println(me.getKey() + ":" + me.getValue());

		}

	}

}
