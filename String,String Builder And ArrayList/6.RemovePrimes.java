import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al)
	{
	    //Arraylist me se koi b element agar remove krna ho to loop ulta chalega taki agar ith element remove hot to usse aage vala element jb i pr aaye to jo ab element i par aaya vo phle se check ho chuka hai
	    
	for(int i=al.size()-1;i>=0;i--)
	//string ki length aur aur array list ka size k bad () aate h 
	{
	    if(isPrime(al.get(i)))
	    
	    //isme al[i] nhi hota,yha pe get function hota hai      
	    {
	    al.remove(i);//agar index vala element prime hai then remove i and its element
	    }
	}
	
	}	
	public static Boolean isPrime(int x)
	{
	 boolean flag=true; 
	  for(int i=2;i*i<=x;i++)//prime check krrhe hai 
	  {
	      if(x%i==0)
	      {
	        return false;
	      }
	      
	  }
	  return flag;
	  
	}
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++)
		{
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
