package pack1;

public class Que2 {

	static boolean isPowerOf(int n, int k) {
		if (n == 0)
			return false;

		return (int) (Math.ceil((Math.log(n) / Math.log(k)))) == (int) (Math.floor(((Math.log(n) / Math.log(k)))));
	}

	public static void main(String[] args) {
		if (isPowerOf(8, 2))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (isPowerOf(6, 3))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
