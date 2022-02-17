import java.util.*;
   
   public class Main{
   
   public static void main(String[] args)
    {
     Scanner scan=new Scanner(System.in);

      int n=scan.nextInt();
      int k=scan.nextInt();
      

      int temp=n;
        int NoOfDigits =0;
        while(temp!=0)
        {
          temp=temp/10;//quotient hojati hai n ki value 
          NoOfDigits++;
        }

        k=k%NoOfDigits;//agar k bht bda number hai to chota number hojayega 
        if(k<0)//phle modulus lo aur phir negative ko positive bnao 
        {
          k=k+NoOfDigits;
        }
      //if we are having bigger rotation number than the no.of digits
      //if we have negative roattion , it means , we need to do , k+No of digits rotation
      int divisor =1;
      int multiplier=1;

      for(int i=1;i<=NoOfDigits;i++)//divisor me k no.of 0 hone chahiye aur multiplier me hone chahiye no.of digits - k , no of 0
      {
        if(i<=k)
        {
          divisor=divisor*10;

        }
        else{
          multiplier=multiplier*10;
        }
      }


        int q=n/divisor;
        int r=n%divisor;
      int Ans=(r*multiplier)+q;
      System.out.println(Ans);

    }
   }
