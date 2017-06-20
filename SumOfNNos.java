import java.util.*;
import java.lang.*;
import java.io.*;
class SumOfNNos
{
	public static void main (String[] args) throws java.lang.Exception
	{
          int n,sum=0;
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
          for(int i=0;i<n;i++)
          {
           sum+=s.nextInt();
          }
          System.out.print("\nSum of given "+n+" numbers is "+sum);
	}
}
