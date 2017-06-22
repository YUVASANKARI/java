import java.io.*;
import java.util.*;
public class WorkingDay
{
 public static void main(String [] args)
 {
   Scanner s=new Scanner(System.in);
   System.out.println("\nEnter the day: ");
   String day=(s.nextLine()).toUpperCase();
   //System.out.println(day);
   if(day.equals("SUNDAY"))
    System.out.println("false");
   else
    System.out.println("true");
 }
}
