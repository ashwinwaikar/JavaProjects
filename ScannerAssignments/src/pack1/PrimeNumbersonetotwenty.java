package pack1;

//16) display prime numbers from 2 to 20
public class PrimeNumbersonetotwenty {
	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 2; i <= 20; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 2 to 20 are :");
		System.out.println(primeNumbers);
	}
}