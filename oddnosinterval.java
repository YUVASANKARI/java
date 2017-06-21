import java.util.*;
import java.lang.*;
public class oddnosinterval 
{
public static void main(String[] args)
 {
  int n1,n2;
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter the interval: ");
  n1=s.nextInt();
  n2=s.nextInt();
  for(int i=n1;i<=n2;i++)
  {
   if(i%2!=0)
    System.out.println(i+"\n");
  }
 }
}
