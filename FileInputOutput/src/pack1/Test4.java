package pack1;
/*4) Write a file copy program using unicode character streams.
( FileWriter and FileReader )
*/
import java.io.*;
public class Test4
{
  public static void main(String args[])
  {
    try
    {  
      FileReader fr = new FileReader("D:\\VITA E-DAC\\Java\\Day_10_a\\Assignments\\abc2.txt");
      FileWriter fw = new FileWriter("D:\\VITA E-DAC\\Java\\Day_10_a\\Assignments\\newcopy2.txt");
     
      int k;
      while( ( k = fr.read() ) != -1 )
      {
        fw.write(k);   		
        System.out.print((char) k);  
      }
      fw.close();
      fr.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File does not exist. " + e);
    }
    catch(IOException e)
    {
      System.out.println("Some I/O problem. " + e);
    }
  }
}