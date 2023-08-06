import java.util.Scanner;
import pack1.MyArithException;
import pack1.Calculator;

/*
2) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative is passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.


*/
public class MyCalcApp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number");
		int number = sc.nextInt();
		try {
			c.caldouble(number);
		} catch (MyArithException e) {
			System.out.println(e);
		} finally {
			System.out.println("Done! Congrats!");
		}
	}
}
