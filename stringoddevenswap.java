import java.io.*;
import java.util.*;
import java.lang.*;
public class stringoddevenswap
{
 public static void main(String [] args)
 {
  StringBuilder str;
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter the string: ");
  str=new StringBuilder(s.nextLine());
  int i;
  char temp;
  if(str.length()%2==0)
  { 
   for(i=0;i<str.length();i=i+2)
   {
    temp=str.charAt(i+1);
    str.setCharAt(i+1,str.charAt(i));
    str.setCharAt(i,temp);
   }
  }
  else
  { 
   for(i=0;i<str.length()-1;i=i+2)
   {
    temp=str.charAt(i+1);
    str.setCharAt(i+1,str.charAt(i));
    str.setCharAt(i,temp);
   }
  }
  System.out.println(str);
 }
}
