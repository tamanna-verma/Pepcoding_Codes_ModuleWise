import java.io.*;
import java.util.*;

public class Main 
{

	public static void solution(String str)
	{
//hume string mili , ab us string k sare substring nikalni hai aur fir ye check krna hai ki substrings me se palindromic konsi hai aur konsi nhi hai 
	for(int i=0;i<str.length();i++)
	{
	    for(int j=i+1;j<=str.length();j++)
	    {
	        String substr=str.substring(i,j);
	       // System.out.print(substr+" ");
	        Boolean isPalindrome=(IsPalindrome(substr));
	        if(isPalindrome==true)
	        {
	            System.out.println(substr);
	        }
	    }
	}
	}

public static boolean IsPalindrome(String str)
{
 Boolean flag=true;
 int left=0;
 int right=str.length()-1;//hume index pe data check krna hai to ek extra index dene ki jroorat nhi hai end me taki substring nikal paye
 
 while(left<right)
 {
     if(str.charAt(left)!=str.charAt(right))
     {
        flag=false; 
        break;
     }
     left++;
     right--;
 }
 return flag;
 }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String ans = scn.next();
		solution(ans);
	}

}
