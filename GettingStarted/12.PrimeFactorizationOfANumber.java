import java.util.*;

public class Main
{

public static void main(String[] args)
 {
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();

   for(int i=2;i*i<=n;i++)//yha se hume prime factors milte rhege
   {
      while(n%i==0)
      {
        System.out.print(i+" ");
        n=n/i;

      }

   }

      //kbi kbi root n tk divide hone k bad b number bach jata hai , jese 
      //46 /2==2*23//ab 2 to factor me aajayega but 23 root n se jada hai 
      //to kbi kbi last me prime number bach jate hai as 23 is a prime number /
    //to iske liye hum ek exception lgadete h ki n agar loop se bahar aane k bad 
    // n ki value agar >1 hai to mtlb last me ek prime number bacha hai jo root n se bda hai 
//to use b krado print

if(n!=1)
{
  System.out.print(n+" ");
}


 }


}
