package packarr2;
/*
 2) create a class "DemoArr",with the
 function "disp". create 4 objects of this 
 class in an array.
	Traverse the array and invoke "disp"
on each objects.
  */

class DemoArr{
	public void disp() {
		System.out.println("Display");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		DemoArr [] arr=new DemoArr[4];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new DemoArr(); // object creation
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i].disp();
		}
		
	}

}
