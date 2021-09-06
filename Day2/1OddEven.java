import java.util.Scanner;
public class PrintOddEvenTillN4
{

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=1;
		while(x<=n)
		{
		if(x%2==0)
		{
			System.out.println(x +"is even");
		}
		else 
		{
			System.out.println(x +" is odd");
		}
		x++;
		}
	}

}
