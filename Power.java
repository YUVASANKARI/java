import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class Power
{
 public static void main (String[] args)
 {
  	 int base, pow;
	  	Scanner input = new Scanner(System.in);
	  	System.out.println("\nEnter the base value:");
	  	base= input.nextInt();
	  	System.out.println("\nEnter the power value:");
  		pow= input.nextInt();
	  	input.close();
  		System.out.println("Value: "+ power(base,pow) ); 
 }


//Works for all positive integers
	private static int power(int base, int pow)
	{
	  	int result = 1;

	  	for (int i = 0; i < pow; ++i) 
		     	result *= base;

	  	return result;
	}

}
