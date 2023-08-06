package learn;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> courses = new HashMap<>();
		
		//adding elements
		courses.put("Core java", 1009);
		courses.put("Basic python", 4568);
		courses.put("Spring", 8000);
		courses.put("Android", 1700);
		courses.put("Spring", 8000);
		
		System.out.println(courses);
		
		System.out.println("+++++++++++++++++++++");
		
		courses.forEach((key,val)->{
			 System.out.println(key+"=>"+val);
		});
		
		//to get any value of a perticular key
		System.out.println(courses.get("Basic python"));
		
	}

}
