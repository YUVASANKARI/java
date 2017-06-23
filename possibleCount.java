import java.util.*;
public class possibleCount
{
 public static void main(String [] args)
 {
  String str;
  Scanner s=new Scanner(System.in);
  System.out.print("\nEnter the string:");
  str=s.nextLine();
  int n=str.length();
  System.out.println("\nNo of possible ways to group the string : "+(n+1-2));
 }
}
    
