import java.util.*;
public class singleInteger
{
 public static void main(String [] args)
 {
  int j,single=0,i,n,flag=0;
  String aaa="yuva";
  String bbb=new String("yuva");
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
     arr[j]=1234567;
     flag=1;
     break;
    }
    else
     flag=0;   
   }                                                                                    
   if(flag==1)
    continue;
   else if(arr[i]!=1234567)
   {
   single=arr[i];
   }
  }
  System.out.println(single);
  
 }
}
