import java.io.*;
import java.util.*;
import java.lang.*;
public class indexEqualsElement
{
public static void main(String args[])
{
  int n=0,i,j,flag=0;
  float sss;
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter n value: ");
  try
  {
   n=s.nextInt();
   //sss=s.nextLine();
   sss=s.nextFloat();
   if(n<=0)
   {
 	   System.out.println("\nEnter valid n value");
	   System.exit(0);
   }
  }
  catch(java.util.InputMismatchException e)
  {
	  System.out.println("Please enter a valid type ");
	  return;
  }
  int arr[] = new int[n];
  System.out.println("\nEnter the array1 elements one by one: ");
  for ( i = 0; i < n;i++)
  {
   arr[i]=s.nextInt();
  }
  for(i=0;i<n;i++)
  {
   if(i==arr[i])
   {
    System.out.println(arr[i]);
    flag=1;  
   }
  }
  if(flag==0)
   System.out.println("No such element");
 }
} 

