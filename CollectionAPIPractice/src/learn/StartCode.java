package learn;

//import util class reqd classes
import java.util.*;;

public class StartCode {

	public static void main(String[] args) {
		System.out.println("Welcome Bhai");

		/*
		 * creating collection
		 * 
		 * 1)Type Safe- same type of elements(objects) are added to collection
		 * 
		 * 
		 * 2)Un Type safe- different types of elements can be added to collection
		 * 
		 */

		// LIST

		// Type safe collection
		ArrayList<String> names1 = new ArrayList<>();
		names1.add("Vanashree");
		names1.add("Ashwin");
		names1.add("Laxmi");
		// names.add(3);//we cannot add another type object
		System.out.println(names1);
		System.out.println(names1.get(2));

		// Not Type safe collection
		/*
		 * ArrayList names2 = new ArrayList(); names2.add("ASW"); names2.add(1009);
		 * names2.add(1009.54); names2.add(true); System.out.println(names2);
		 * System.out.println(names2.get(2));
		 */

		names1.remove("Laxmi");
		System.out.println(names1);

		System.out.println(names1.size());

		System.out.println(names1.contains("Vanashree"));

		System.out.println(names1.isEmpty());

		names1.set(1, "Kadarkhan");
		System.out.println(names1);
		names1.add(1, "Ashwin");

		Vector<String> v = new Vector<>();
		v.addAll(names1);
		System.out.println(v);

		System.out.println(
				"_________________________________________________________________________________________________");

		// SET

		HashSet<Double> nms = new HashSet<>();
		nms.add(12.13);
		nms.add(322.342);
		nms.add(new Double(213.12312));
		nms.add(223.23);
		nms.add(12.13);
		System.out.println(nms);
		
		TreeSet<Double> tset=new TreeSet<>();
		 tset.addAll(nms);
		 tset.add(300.12);
		 System.out.println(tset);
	}

}
