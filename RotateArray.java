import java.util.*;
public class RotateArray
{
 public static void main(String [] args)
 {
  int j,temp,i,n,k;
  Scanner s=new Scanner(System.in);
  System.out.print("\nEnter the n value:");
  n=s.nextInt();
  int []arr=new int[n];
  for(i=0;i<n;i++)
  {
   arr[i]=s.nextInt();
  }
   System.out.print("\nEnter the key size to rotate: ");
   k=s.nextInt();
   for(i=0;i<k;i++)
   {
    temp=arr[n-1];
    for(j=n-2;j>=0;j--)
    {
     arr[j+1]=arr[j];
    }
    arr[0]=temp;
   }
   for(i=0;i<n;i++)
    System.out.print(arr[i]);
 }
}
