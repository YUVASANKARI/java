import java.io.*;
import java.util.*;
import java.lang.*;
public class kthLargest
{
 public static void main(String [] args)
 {
  int i,j,tmp,k,n=0;
  Scanner s=new Scanner(System.in);
  int arr[]=new int[50];
  System.out.println("\nEnter the ages: ");
  for(i=0;i<50;i++)
  {
    arr[i]=s.nextInt();
  }
  for(i=0;i<50;i++)
  {
   for(j=i+1;j<50;j++)
   {
    if(arr[i]>arr[j])
    {
    tmp=arr[i];
    arr[i]=arr[j];
    arr[j]=tmp; 
    }
   }
  }
  System.out.println("\nFourth largest element is "+arr[3]);
  System.out.println("\nEnter the kth value : ");
  k=s.nextInt();
  System.out.println("\n "+k+"th largest element is "+arr[k-1]);
 }
}
