import java.util.*;
import java.io.*;
import java.lang.*;
public class camelCase
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter the string: ");
  String str=s.nextLine();
  String camelcase="";
  char c=str.charAt(0);
  camelcase+=Character.toUpperCase(c);
  for(int i=1;i<str.length();i++)
  {
   char currentChar = str.charAt(i);
   char previousChar = str.charAt(i - 1);
   if (previousChar == ' ') {
      camelcase = camelcase + Character.toUpperCase(currentChar);
   }else if(currentChar==' ')
    {
    }
   else {
      camelcase = camelcase + Character.toLowerCase(currentChar);
    }
  }
  System.out.println("\nCamel case :"+camelcase);
 }
}
