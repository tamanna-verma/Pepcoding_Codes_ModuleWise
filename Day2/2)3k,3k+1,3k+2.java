import java.util.Scanner;
public class IfElse3K_2 
{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		if(x%3==0)
		{
			System.out.println("It is 3k num");
		}
		else 	if(x%3==1)
		{
			System.out.println("It is 3k +1");
			
		}
		else 	
		{
			System.out.println("It is 3k +2");
			
		}
	}
}

