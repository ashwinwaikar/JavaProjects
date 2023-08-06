import pack1.First;
import pack1.Second;

public class MyApp {

	public static void main(String[] args) {
		First f1=new First();
		f1.setNum(1009);
		System.out.println(f1.getNum());
		
		Second s1=new Second();
		s1.setMessage("Ashwin you have successfully completed client developer project congrats");
		System.out.println(s1.getMessage());

	}

}
