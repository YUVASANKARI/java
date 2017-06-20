import java.util.*;
import java.lang.*;
import java.io.*;
class LeapYear1
{
	public static void main (String[] args) throws java.lang.Exception
	{
                int i;
                Scanner s=new Scanner(System.in);
                i=s.nextInt();
                  if(i%400==0)
                  {
                   System.out.println(i+"is a leap year\n");
                  }
                  else if(i%100!=0 && i%4==0)
                  {
                   System.out.println(i+"is a leap year\n");
                  }
                  else
                    System.out.println(i+"is a not leap year\n");
 
	}
}
