import java.io.*;
import java.util.*;
import java.lang.*;
public class deletingKDigits
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  int res=0,k,tmp,n,i=0,j,size;
  System.out.println("\nEnter the no: ");
  n=s.nextInt();
  int arr[]=new int[10];
  System.out.println(n);
  while(n!=0)
  {
   arr[i++]=n%10;
   n=n/10;
  }
  size=i;
  System.out.println(size);
  for(i=0;i<size;i++)
   System.out.println("*****"+arr[i]);
  
  
  for(i=0;i<size;i++)
  {
  for(j=i+1;j<size;j++)
   { 
    if(arr[i]>arr[j])
    {
     tmp=arr[i];
     arr[i]=arr[j];
     arr[j]=tmp;  
    }
   }
  }
  for(i=0;i<size;i++)
   System.out.println("*****"+arr[i]);
  System.out.println("\nEnter the k digit:");
  k=s.nextInt();
  for(i=0;i<(size-k);i++)
  {
   res=(res*10)+arr[i];
  }
  System.out.println(res);
 }
}
