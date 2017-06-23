import java.util.*;
public class findFirstRepeat
{
 public static void main(String [] args)
 {
  int j,repeat=0,i,n,flag=0;
  Scanner s=new Scanner(System.in);
  System.out.print("\nEnter the n value:");
  n=s.nextInt();
  int []arr=new int[n];
  for(i=0;i<n;i++)
  {
   arr[i]=s.nextInt();
  }
  for(i=0;i<n-1;i++)
  {
   for(j=i+1;j<n;j++)
   {
    if(arr[i]==arr[j])
    {
     flag=1;
     repeat=arr[i];
     break;
    }
   }
   if(flag==1)
    break;
  }
  System.out.println("\nFirst repeating element is : "+repeat);
 }
}
    
