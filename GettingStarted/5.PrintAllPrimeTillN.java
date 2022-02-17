import java.util.*;

public class Main{
    public static void main(String[] args)
     {
      Scanner scan=new Scanner(System.in);
      int low=scan.nextInt();
      int high=scan.nextInt();

      for(int i=low;i<=high;i++)//low se high tk k numbers ko hum check krrhe hai whether they are prime or not 
      {
         
         Boolean flag=true;
          for(int j=2;j*j<=i;j++)//j is the number from 2 to root i
          {
             if(i%j==0)
             {
               flag=false;
             }
          }

          if(flag==true)
          {
              System.out.println(i);
          }
      }

    }
}
