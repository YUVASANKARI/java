import java.io.*;
import java.util.*;
public class RomanToInt
{
 public static void main(String [] args)
 {
   Scanner s=new Scanner(System.in);
   System.out.println("\nEnter the roman numeral: ");
    String roman=s.nextLine();
    int decimal = 0;
    String romanNumeral = roman.toUpperCase();
    for(int x = 0;x<romanNumeral.length();x++)
    {
        char convertToDecimal = Character.toUpperCase(roman.charAt(x));
        //System.out.println(convertToDecimal);
        switch (convertToDecimal)
        {
        case 'M':
            decimal += 1000;
            break;

        case 'D':
            decimal += 500;
            break;

        case 'C':
            decimal += 100;
            break;

        case 'L':
            decimal += 50;
            break;

        case 'X':
            decimal += 10;
            break;

        case 'V':
            decimal += 5;
            break;

        case 'I':
            decimal += 1;
            break;
         
        }
    }
    if (romanNumeral.contains("IV"))
    {
        decimal-=2;
    }
    if (romanNumeral.contains("IX"))
    {
        decimal-=2;
    }
    if (romanNumeral.contains("XL"))
    {
        decimal-=20;
    }
    if (romanNumeral.contains("XC"))
    {
        decimal-=20;
    }
    if (romanNumeral.contains("CD"))
    {
        decimal-=200;
    }
    if (romanNumeral.contains("CM"))
    {
        decimal-=200;
    }
    System.out.println("\nEquivalent integer of roman numeral "+romanNumeral+" is "+decimal);
}
}
