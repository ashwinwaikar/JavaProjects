package ClientPro;

import mypack.Course;
import mypack.Dac;
import mypack.MSCIT;
import mypack.PgDbda;

public class CourseDemo {

	public static void main(String[] args) {
		Course arr[] = new Course[5];
		arr[0] = new Dac();
		arr[1] = new PgDbda();
		arr[2] = new MSCIT();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Dac) {
				Dac d = (Dac) arr[i];
				d.contents();
				d.orientation();

			}
		}
	}

}
