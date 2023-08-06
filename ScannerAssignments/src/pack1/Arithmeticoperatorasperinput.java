package pack1;

import java.util.Scanner;

//4) accept 2 numbers and a character as operator ( + , - ,* , / , % ).

//Perform arithmetic according to the character entered.

public class Arithmeticoperatorasperinput {

	public static void main(String[] args) {
		System.out.println("Enter two Numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Enter a character of operator which you want to perform");
		char ch = sc.next().charAt(0);

		int c;
		switch (ch) {
		case '+':
			c = a + b;
			System.out.println("Additon of two numbers are " + c);
			break;
		case '-':
			c = a - b;
			System.out.println("Substraction of two numbers are " + c);
			break;
		case '*':
			c = a * b;
			System.out.println("Multiplication of two numbers are " + c);
			break;
		case '/':
			c = a / b;
			System.out.println("Division of two numbers are " + c);
			break;
		case '%':
			c = (a * 100) / b;
			System.out.println("Additon of two numbers are " + c);
			break;

		default:
			System.out.println("Enter a valid Operator");
			break;
		}
	}

}
