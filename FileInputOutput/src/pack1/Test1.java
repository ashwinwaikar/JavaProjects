package pack1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*	1)accept 10 characters from a user (use Scanner).
	store these 10 characters in a file. (FileWriter)
	Now open a file and read all these characters.*/
public class Test1 {

	public static void main(String[] args) {
		char arr1[] = null;

		Scanner sc = new Scanner(System.in);

		char arr[] = new char[10];
		try (FileWriter fw = new FileWriter("D:\\VITA E-DAC\\Java\\Day_10_a\\Assignments\\abc1.txt")) {
			System.out.println("Enter 10 characters");
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.next().charAt(0);
			}
			fw.write(arr);

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try (FileReader fr = new FileReader("D:\\VITA E-DAC\\Java\\Day_10_a\\Assignments\\abc1.txt")) {
			arr1 = new char[(int) new File("D:\\VITA E-DAC\\Java\\Day_10_a\\Assignments\\abc1.txt").length()];
			fr.read(arr1);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(arr1[i]);
		}

	}

}
