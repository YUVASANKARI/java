import java.util.*;
import java.lang.*;
import java.io.*;
class PosNum
{
 public static void main (String[] args) throws java.lang.Exception
 {
  Scanner s=new Scanner(System.in);
  int no=s.nextInt();
  if(no>0)
   System.out.println(no+" is a positive number");
  else if(no<0)
    System.out.println(no+" is a negative number");	
  else
    System.out.println(no+" is zero");
 }
}
