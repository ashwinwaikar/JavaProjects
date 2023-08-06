
/**
 * 
 */
import studpack.*;

/**
 * @author ASW
 *
 */
public class ClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAddress("sakoli");
		s1.setAge(23);
		s1.setName("Ashwin");

		System.out.println(s1.getAddress());
		System.out.println(s1.getAge());
		System.out.println(s1.getName());

		Student s2 = new Student("piyush", "nagpur", 58);
		System.out.println(s1.getAddress());
		System.out.println(s1.getAge());
		System.out.println(s1.getName());

	}

}
