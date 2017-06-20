import java.util.*;
import java.lang.*;
import java.io.*;
class LargestNum
{
 public static void main (String[] args) throws java.lang.Exception
 {
   System.out.println("\nEnter the three numbers...");
   Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   int b=s.nextInt();
   int c=s.nextInt();
   int n=a > b ? (a > c ? a : c) : (b > c ? b : c) ;
   System.out.println("\n"+n+"is the largest among the given three numbers...");
 }
}
