import java.io.*;
import java.util.*;
import java.lang.*;
public class minsbwtime
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the two times in hh mm format : ");
  long mins=(long)((s.nextInt()*60-s.nextInt())-(s.nextInt()*60-s.nextInt()));
  System.out.println("Mins Difference : "+mins);
 }
}
