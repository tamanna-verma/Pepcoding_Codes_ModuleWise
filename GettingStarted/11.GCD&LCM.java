import java.util.Scanner;
import java.util.*;
    
    public class Main
    {
    
    public static void main(String[] args)
     {
       Scanner scan=new Scanner(System.in);
       int n1=scan.nextInt();
       int n2=scan.nextInt();

       //hume n1 aur n2 milgye hai 
       int divisor=n1;
       int divident=n2;

       while(divident%divisor!=0)
      {
      int temp=divisor;
      int remainder= divident%divisor;
      divisor=remainder;
      divident=temp;
      }
      int gcd=divisor;
      // n1*n2=gcd*lcm
      int lcm=(n1*n2)/gcd;

      System.out.println(gcd);
      System.out.println(lcm);


     }
    }
