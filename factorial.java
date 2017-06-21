import java.util.*;
public class factorial
{
 public static void main(String [] args)
 {
  
  Scanner s=new Scanner(System.in);
  int fac=1,n;
  n=s.nextInt();
  for(int i=1;i<=n;i++)
   fac*=i;
  System.out.print("\nFactorial value is "+fac);
 }
}
