import java.lang.*;
import java.io.*;
import java.util.*;
public class myfile
{
  public static void main(String [] args)
  {
    String str;
    Scanner s=new Scanner(System.in);
    str=s.nextLine();
    System.out.println(str);
    String[] s=str.split(" ");
    for(int i=0;i<s.length;i++)
    {
      System.out.println(s[i]);
    }
  }
}
