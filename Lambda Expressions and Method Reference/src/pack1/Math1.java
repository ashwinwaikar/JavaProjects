package pack1;

/*3)	define a functional interface "Fifth" with an abstract method "int add(int a,int b)"
		define a class Math1 with a method "int calc(int a,int b)" 
		inside main function invoke "calc" method with the help of
			a) lamdba expression
			b) method reference
*/
interface Fifth{
	public abstract int add(int a,int b);
}

public class Math1 {
	int calc(int a,int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		Math1 m=new Math1();
		
		/*using lambda expression
		Fifth f=(int x,int y)->{return m.calc(x,y);};
		System.out.println(f.add(100, 200));
		*/
		
		Fifth f1=m::calc;
		System.out.println(f1.add(10,20));
		
	}

}
