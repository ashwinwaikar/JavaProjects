package mypack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*create a HashMap for storing string moviename as key and lead actor
name as value.
Store at least 5 movies inside the HashMap.
display it using iterator.*/
public class MyClass {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("movie1", "Harry Potter");
		hm.put("movie2", "Tararampum");
		hm.put("movie3", "Gangs of wasepur");
		hm.put("movie4", "Mirzapur");
		hm.put("movie5", "Sakoli ki dastan");

		System.out.println(hm);

		Iterator itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry mapElement = (Map.Entry) itr.next();
			String moviekey = (String) mapElement.getKey();
			String movievalue = (String) mapElement.getValue();
			System.out.println(moviekey + " " + movievalue);
		}
	}

}
