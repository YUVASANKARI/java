import java.util.*;
import java.lang.*;
import java.io.*;
class SumOfNatNos
{
	public static void main (String[] args) throws java.lang.Exception
	{
          int n,sum=0;
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
          for(int i=1;i<=n;i++)
          {
           sum+=i;
          }
          System.out.print("\nSum of "+n+" numbers is "+sum);
	}
}
