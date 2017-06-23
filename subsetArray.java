import java.io.*;
import java.util.*;
import java.lang.*;
public class subsetArray
{
public static void main(String args[])
{
  int n1,n2,i,j,flag=0;
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter n1 and n2 value: ");
  n1=s.nextInt();
  n2=s.nextInt();
  int a,n;
  if(n1>=n2)
  {
   n=n1;
   a=1; 
  }
  else
  {
   n=n2;
   a=2;
  }
  int arr1[] = new int[n1];
  int arr2[] = new int[n2];
  System.out.println("\nEnter the array1 elements one by one: ");
  for ( i = 0; i < n1;i++)
  {
   arr1[i]=s.nextInt();
  }

  System.out.println("\nEnter the array2 elements one by one: ");
  for (i = 0; i < n2;i++)
  {
   arr2[i]=s.nextInt();
  }
  if(a==1)
  { 
  for(i=0;i<n2;i++)
  {
   for(j=0;j<n1;j++)
   {
    if(arr2[i]==arr1[j])
    {
     flag=1;
     break;
    }
    else
    {
     flag=0;
     continue;
    }
   }
   if(j==n1)
   {
    flag=2;
    break;
   }
  }
  if(i==n2)
   System.out.println("Given array2 is subset of array 1");
  else
   System.out.println("Given array2 is not subset of array 1");  
  }
  else
  {
   for(i=0;i<n1;i++)
   {
   for(j=0;j<n2;j++)
   {
    if(arr1[i]==arr2[j])
    {
     flag=1;
     break;
    }
    else
    {
     flag=0;
     continue;
    }
   }
   if(j==n2)
   {
    flag=2;
    break;
   }
  }
  if(i==n1)
   System.out.println("Given array1 is subset of array 2");
  else
   System.out.println("Given array1 is not subset of array 2");  
  }
 }
}
