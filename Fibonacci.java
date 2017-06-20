import java.util.*;
import java.lang.*;
import java.io.*;
class Fibonacci
{
 public static void main (String[] args) throws java.lang.Exception
 {
   int n,fib1=0,fib2=1,temp;
   Scanner s=new Scanner(System.in);
   System.out.println("\nEnter the n value:");
   n=s.nextInt();
   System.out.println("FIBONACCI SERIES: ");
   System.out.println(fib1+"\n"+fib2);
   for(int i=0;i<n;i++)
   {
    temp=fib1;
    fib1=fib2;
    fib2=temp+fib2;
    System.out.println(fib2);
   }
 }
}
