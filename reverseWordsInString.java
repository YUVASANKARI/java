import java.io.*;
import java.util.*;
import java.lang.*;
public class reverseWordsInString
{
 public static void main(String [] args)
 {
  int i;
  Scanner s=new Scanner(System.in);
  String str,tmp;
  System.out.println("\nEnter the string: ");
  str=s.nextLine();
  String[] arr = str.split(" ");
  int n=arr.length;
  System.out.println(n);    
  for(i=0;i<n/2;i++)
  {
   tmp=arr[i];
   arr[i]=arr[n-i-1];
   arr[n-i-1]=tmp;
  }
  for(i=0;i<n;i++)
   System.out.print(arr[i]+" ");
 }
}
