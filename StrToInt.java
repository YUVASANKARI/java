import java.io.*;
import java.util.*;
public class StrToInt
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  //String str="1234";
  int n=Integer.parseInt(str);
  System.out.println("Equivalent int of string "+str+" is"+n);
 }
}
