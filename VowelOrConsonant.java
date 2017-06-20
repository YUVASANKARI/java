import java.util.*;
import java.lang.*;
import java.io.*;
class VowelOrConsonant
{
 public static void main (String[] args) throws java.lang.Exception
 {
   Scanner s=new Scanner(System.in);
   char c=s.nextInt(); 
   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
   {
    System.out.println(c +" is a vowel");
   } 
   else
   {
    System.out.println(c +" is a not a vowel");
   } 
 }
}
