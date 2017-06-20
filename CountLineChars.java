import java.util.*;
import java.lang.*;
import java.io.*;
class CountLineChars
{
 public static void main (String[] args) throws java.lang.Exception
 {
   int charcount=0,digitcount=0,others=0;
   String line;
   Scanner s=new Scanner(System.in);
   System.out.println("\nEnter the line:");
   line=s.nextLine();
   for(int i=0;i!=line.length();i++)
   {
    if(line.charAt(i)>='A'&&line.charAt(i)<='Z' || line.charAt(i)>='a'&&line.charAt(i)<='z')
     charcount++;
    else if(line.charAt(i)>='0'&&line.charAt(i)<='9')
     digitcount++;
    else
     others++;
   }
    System.out.println("\nNo of chars at given line is: "+charcount);
    System.out.println("\nNo of digits at given line is: "+digitcount);
    System.out.println("\nNo of other chars including space at given line is: "+others);
 }
}
