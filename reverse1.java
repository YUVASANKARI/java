import java.util.*;
public class reverse1
{
 public static void main(String [] args)
 {
  
  Scanner s=new Scanner(System.in);
  int rev=0,n;
  n=s.nextInt();
  while(n!=0)
  {
   rev=(rev*10)+(n%10);
   n=n/10;
  }
  System.out.print("\nReversed value is "+rev);
 }
}
