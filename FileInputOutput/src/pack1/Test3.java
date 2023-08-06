package pack1;

/*	3) write a file copy program using byte streams.
	( FileOutputStream and FileInputStream )
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
	public static void main(String[] args) {

		byte[] array = new byte[1000];
		try {
			FileInputStream sourceFile = new FileInputStream("D:\\VITA E-DAC\\Java\\Day_10_a\\Assignments\\abc2.txt");
			FileOutputStream destFile = new FileOutputStream(
					"D:\\VITA E-DAC\\Java\\Day_10_a\\Assignments\\newcopy1.txt");

			// reads all data from abc2.txt
			sourceFile.read(array);

			// writes all data to newcopy1
			destFile.write(array);
			System.out.println("The input.txt file is copied to newFile.");

			// closes the stream
			sourceFile.close();
			destFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
