import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str)
	{
	    StringBuilder ans=new StringBuilder(str);
	    for(int i=0;i<ans.length();i++)
        {
            char ch =ans.charAt(i);
           //agar ch small cse letter hoga to hume use uppercasse letter bnana hai aur agar uppercase letter hoga to hume use lower case letter bnana hai 
           //'E'-'A'='e'-'a'//in dono k beech ka gap is equal so we can say that they both are equal
           //'E'='e'-'a'+'A'
           //to convert uppercase to lowercase
           // lc=Uc-'A+'a';
           //to convert lowercase to uppercase
           // Uc=lc-'a'+'A'
            if(ch>='A'&&ch<='Z')// to convert to lower case
            {
              ch=(char)(ch-'A'+'a');    
            }
            else if(ch>='a'&&ch<='z')// to convert to upper case
            {
             ch=(char)(ch+'A'-'a');   
            }
            ans.setCharAt(i,ch);
        }		
		
		return ans.toString();
	}
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
