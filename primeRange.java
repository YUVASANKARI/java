import java.io.*;
import java.util.*;
import java.lang.*;
public class primeRange
{
 public static void main(String [] args)
 {
  int i,j;
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter the range: ");
  int n1=s.nextInt();
  int n2=s.nextInt();
  for(i=n1;i<=n2;i++)
  {
   for(j=2;j<=i/2;j++)
   { 
    if(i%j==0)
     break;
   }
   if(j==(i/2)+1)
    	System.out.println(i);
  }
 }
}
