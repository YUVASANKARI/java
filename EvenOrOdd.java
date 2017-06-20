import java.util.*;
import java.lang.*;
import java.io.*;
class EvenOrOdd
{
 public static void main (String[] args) throws java.lang.Exception
 {
   Scanner s=new Scanner(System.in);
   int no=s.nextInt(); 
   if(no%2==0)
   {
    System.out.println(no +" is an even no");
   } 
   else
   {
    System.out.println(no +" is an odd no");
   } 
 }
}
