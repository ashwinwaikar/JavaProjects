package pack1;

/*7)	define a class "Student" with name and age as member variables, parameterized constructor , setters , getters and "toString" method. 
		define a functional interface "MyInterface" with an abstract method "void show(Student ref)"
		inside main function 
		a) create an instance of "Student" class by passing "Vijay" and '20' values.
		b) create method reference for "MyInterface" and display the instance of "Student" class created above.
*/
class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

interface MyInterface {
	public abstract void show(Student ref);
}

public class Test3 {

	public static void main(String[] args) {
		Student s = new Student("ASHWIN WAIKAR", 23);

		MyInterface m = System.out::println;
		m.show(s);
	}

}
