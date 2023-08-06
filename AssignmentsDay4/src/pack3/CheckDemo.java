package pack3;
/*
 3)	Define a class “Check” in which declare member variables using  different accessibility modifiers 
	i.e.<default>, private ,public and protected. 
	Define a function “disp”  which should be public.
	Define a class “CheckDemo” in which you will write “main()” function. 
	Create an instance of  the class “Check” and  show how many  variables can be accessed directly 
	and how many indirectly. 
  */

class Check {
	static int p = 10;
	private int q = 20;
	public int r = 30;
	protected int s = 40;

	public void disp() {
		System.out.println("Check Method");
	}

	public int getQ() {
		return q;
	}

}

public class CheckDemo {

	public static void main(String[] args) {
		Check c1 = new Check();
		c1.disp();
		System.out.println(c1.p);// <default> can be accesible within the same package
		System.out.println(c1.getQ());// private can be accesible within the same class//thats why we require the 
		System.out.println(c1.r);// public can be acccesible anywhere
		System.out.println(c1.s);// protected can we accesible within pakage and inside subclass in

	}

}
