import java.util.*;
import java.lang.*;
import java.io.*;
class NoOfDigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
          int n,cnt=0;
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
          while(n!=0)
          {
           cnt++;
           n=n/10;
          }
          System.out.print("\nNo of digits is "+cnt);
	}
}
