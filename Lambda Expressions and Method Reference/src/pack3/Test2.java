package pack3;

/*6)	define a functional interface "Seventh" with an abstract method "void fun(int k)".
		define a class "Sample" with parameterized constructor with the message "inside parameterized constructor of Sample\t"+k .
		inside main function instantiate "Sample" by passing value "200" using method reference to "Seventh"
*/
interface Seventh {
	public abstract void fun(int k);
}

class Sample {
	Sample(int k) {
		System.out.println("inside parameterized constructor of Sample\t" + k);
	}
}

public class Test2 {

	public static void main(String[] args) {
		Seventh s = Sample::new;
		s.fun(1009);
	}

}
