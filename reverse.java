import java.util.*;
public class reverse
{
 public static void main(String [] args)
 {
  
  Scanner s=new Scanner(System.in);
  
  String str=new StringBuffer(s.nextLine()).reverse().toString();
  System.out.print("\nReversed string is "+str);
 }
}
