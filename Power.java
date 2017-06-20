import java.util.*;
import java.lang.*;
import java.io.*;
class Power
{
 public static void main (String[] args) throws java.lang.Exception
 {
   int base,pow,res=1;
   Scanner s=new Scanner(System.in);
   System.out.println("\nEnter the base value:");
   base=s.nextInt();
   System.out.println("\nEnter the power value:");
   pow=s.nextInt();
   if(base==0)
    System.out.println("Value: 0");
   else if(pow==0)
    System.out.println("Value: 1");
   else if(pow==1)
    System.out.println("Value: "+base);
   else
   {
    for(int i=1;i<=pow;i++)
     res*=base;
    System.out.println("Value: "+res);  
   }
 }
}
