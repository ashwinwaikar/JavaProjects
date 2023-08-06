package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraversingExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Durgesh");
		names.add("Sitara");
		names.add("Roshni");
		names.add("Vandna");
		names.add("Vandna");
		names.add("ABC");

		// for each loop
		for (String str : names) {
			System.out.println(str + " " + str.length());

			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());

		}
		System.out.println("________________________________________________________");

		// traversing using iterator

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);

		}

		System.out.println("Reversing------------");

		// for backward traversal of the collection we have to use ListIterator
		ListIterator<String> str2 = names.listIterator(names.size());// we give names.size because we want our cursor to
																		// be last for the reverse traverasal
		while (str2.hasPrevious()) {
			String s2 = (String) str2.previous();
			System.out.println(s2);
		}
		
		System.out.println("______________________For Each method_________________________  ");
		//for each method
		names.forEach(e->{
			System.out.println(e);
		});
		
		
		//using for each method for treeset so that we can get a sorted set
		System.out.println("sorted set----");
		TreeSet<String> sss=new TreeSet<>();
		sss.addAll(names);
		sss.forEach(e->{
			System.out.println(e);
		});

	}

}
