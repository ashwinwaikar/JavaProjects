package com.in28minutes.eclipse;

public class SecondJavaClass {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for (int number : arr) {
 			sum=sum+number;
		}
		System.out.println(sum);
	}
          
}
/*Here we learnt that how to debug a java program
Start the Debugger. 
To debug your application, select a Java file with a main method. 
Set breakpoint where we want to debug
Right-click on it and select Debug As Java Application. 
Press f5 to loop through it and f8 to complete the whole execution.

At the right side we will see 
1)Variables 2)Breakpoint 3)Expressions

1)Variables-We can see total variables at that breakpoint and the changing values at every point of execution as soon as we press f5 
2)Breakpoint-We can set condition for different variable ...so until that particular point the execution will be direct then we can loop through by using f5
3)Expressions-We can do different-different expressions for the current situation of the variable and check the corresponding value for every step using f5
*/