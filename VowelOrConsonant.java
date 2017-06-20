import java.util.*;
import java.lang.*;
import java.io.*;
class VowelOrConsonant
{
 public static void main (String[] args) throws java.lang.Exception
 {
   Scanner s=new Scanner(System.in);
   char c=s.next().charAt(0); 
   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
   {
    System.out.println(c +" is a vowel");
   } 
   else if(c>='B'&& c<='Z' || c>='b'&&c<='z')
   {
    System.out.println(c +" is a consonant");
   } 
   else
   {
     System.out.println(c +" is not at an alphabet");
   }
 }
}
