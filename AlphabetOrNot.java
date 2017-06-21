import java.util.*;
import java.lang.*;
import java.io.*;
class AlphabetOrNot
{
 public static void main (String[] args) throws java.lang.Exception
 {
   Scanner s=new Scanner(System.in);
   char c=s.next().charAt(0); 
   if(c>='A'&&c<='Z' || c>='a'&&c<='z')
   {
    System.out.println(c +" is a alpahabet");
   } 
   else 
   {
     System.out.println(c +" is not at an alphabet");
   }
 }
}
