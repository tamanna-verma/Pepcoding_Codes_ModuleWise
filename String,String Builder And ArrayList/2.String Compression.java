import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str)
	{
	String ans="";
	//jhape substring ka kuch kam krna ho to i ki value str.length() tk jayega lekin agar khipe charAt ka kam krna ho to i ki value str.length()-1 tk jayegi 
	for(int i=0;i<str.length()-1;i++)//last second index tk hi check krre hai taki out of bound exception na aaje
    {
      if(str.charAt(i)==str.charAt(i+1))//last second index aise add hi ni hoga kyuki last index agar same hoga to vo to add nhi hoga aur agar alg hoga to add hojayega
      {
         //do nothing
      }
      else
      {
         ans+=str.charAt(i); 
      }
    }
      ans+=str.charAt(str.length()-1);//last index vala element to vese b add krna hi hai
  
    return ans;
	}

	public static String compression2(String str)
	{
	String ans="";//ans string ko phle black rkhlo 
	int count=1;
	for(int i=0;i<str.length()-1;i++)//yha bhi last second index tk hi check krre hai 
	{
	    if(str.charAt(i)==str.charAt(i+1))//agar ith index vala element i+1th index k equal hai to count bdate jao agar next element alag hai to ans string me add krdo use 
	    {
	        count=count+1;
	    }
	    else
	    {
	      ans+=str.charAt(i);
	      if(count>1)
	      {
	          ans+=count;
	          count=1;
	      }
	    }
	}
	ans+=str.charAt(str.length()-1);
	if(count>1)
	{
	    ans+=count;
	}
	return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
