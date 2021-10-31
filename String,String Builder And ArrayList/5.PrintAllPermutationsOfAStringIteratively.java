import java.io.*;
import java.util.*;

public class Main 
{
public static int Factorial(int n)
{
    int factorial=1;
    while(n>0)
    {
      factorial=factorial*n;
      n--;
    }
    return factorial;
}
	public static void solution(String str)
	{
	    //manlo ki ab chai given string to uski permutation kya hogi???? abc,acb, bac,bca,cab,cba..ye hoyege permutations
	    
	int LengthOfString=str.length();
	//length check ki string ki 

	int NumOfPermutation=Factorial(str.length()); 
	//number of permutation hai 6 which is 3 ka factorial
	//ab permutation 6 hai agar to 0 to 5 tk ek loop chalega ,aur  0 se 5 tk sbko ek bar str.length() se divide krege aur jo b remainder aayega , us position vale element ko string me se remove krte jayege, fir jb string abc me se ek element gya ,fir hum us integer(0-5) k quotient  ko str.length-1 se divide krege firse ek element nikal jayega fir us integer(0-5) k quotient  ko str.length()-2 se divide krege ,firse ek element remove hojayega aise tbtk krna hai jbtk str ki length>0 hai.....aise krke hume 6 permutations miljayegi 

	for(int i=0;i<NumOfPermutation;i++)//i se hume 012345 value milegi
	{
	StringBuilder temp=new StringBuilder(str);
	
	// divident mtlb jo divide horha hai 
	
	int divident=i;
	
	//divident me 0 1 2 3 4 5 me jo b i ki value chlrhi h vo store krli taki vo aage disturb na ho age k code se
	
	
	for(int divisor=str.length();divisor>=1;divisor--)
	{
	  int quotient=divident/divisor;
	  int remainder=divident%divisor;
	  
	  System.out.print(temp.charAt(remainder));
	  temp.deleteCharAt(remainder);
	  divident=quotient;
	}
	System.out.println();
	}
}
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
