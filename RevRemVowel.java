import java.util.*;
public class RevRemVowel
{
 public static void main(String [] args)
 {
  int i;
  Scanner s=new Scanner(System.in);
  String str=new StringBuffer(s.nextLine()).reverse().toString();
  System.out.print("\nReversed string is "+str);
  System.out.println("\n");
  for(i=0;i<str.length();i++)
  {
   if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
   {
   }
   else
   {
    System.out.print(str.charAt(i));
   }
  }
 }
}
