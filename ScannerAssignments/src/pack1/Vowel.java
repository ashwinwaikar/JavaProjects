package pack1;

import java.util.Scanner;

/*3) accept a character and display (using if.. else ) whether it is vowel or not.*/
public class Vowel {

	public static void main(String[] args) {
		System.out.println("Enter a Character Which you want to Check");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		switch (ch) {
		case 'A':
			System.out.println("Its a Vowel");
			break;
		case 'E':
			System.out.println("Its a Vowel");
			break;
		case 'I':
			System.out.println("Its a Vowel");
			break;
		case 'O':
			System.out.println("Its a Vowel");
			break;
		case 'U':
			System.out.println("Its a Vowel");
			break;

		default:
			System.out.println("Its NOT a Vowel");
			break;
		}
	}

}
