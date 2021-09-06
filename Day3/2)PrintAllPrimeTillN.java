import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int start=scan.nextInt();
        int end=scan.nextInt();
        
        for(int i=start;i<=end;i++)
        {
            boolean isprime=true;
            for(int j=2;j*j<=i;j++)
            {
              if(i%j==0)
              {
                  isprime=false;
                  break;
              }
              
            }
            if(isprime==true)
            {
                System.out.println(i);
            }
        }
    }
}
