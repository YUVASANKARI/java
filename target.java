import java.io.*;
import java.util.*;
import java.lang.*;
public class target
{
 public static void main(String [] args)
 {
  int i,j,tmp,k,n=0,tar;
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter the n value: ");
  n=s.nextInt();
  int arr[]=new int[n];
  System.out.println("\nEnter the array elements one by one: ");
  for(i=0;i<n;i++)
  {
    arr[i]=s.nextInt();
  }
  System.out.println("\nEnter the target value:");
  tar=s.nextInt();
  for(i=0;i<n;i++)
  {
   for(j=i+1;j<n;j++)
   {
    if(arr[i]+arr[j]==tar)
    {
      System.out.println(arr[i]+" + "+arr[j]+" = "+tar);
      System.exit(0);
    }
   }
  }
  if(i==n)
   System.out.println("\nNo such elements");
 }
}
