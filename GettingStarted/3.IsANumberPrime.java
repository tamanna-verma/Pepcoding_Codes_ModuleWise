import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int j=0;j<t;j++)
        {
        int n=scan.nextInt();

             Boolean flag=true;
              for(int i=2;i*i<=n;i++)
              {
                if(n%i==0)
                {
                  flag=false;
                  
                }

              }
          if(flag==true)
          {
            System.out.println("prime");
          }
          else{
            System.out.println("not prime");
          }
        }
      
   }
  }
