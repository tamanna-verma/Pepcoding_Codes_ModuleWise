import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d)
    {
        int freqOfDigit=0;
       while(n>0)
       {
           int remainder=n%10;//modulo gives remainder of 10
           if(remainder==d)
           {
               freqOfDigit++;
           }
           n=n/10;// /(divide operator se hume milta hai quotient )
       }
       return freqOfDigit;
       
    }
}
