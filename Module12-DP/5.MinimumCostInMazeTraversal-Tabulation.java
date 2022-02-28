import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception
    {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int m=scan.nextInt();

      int arr[][]=new int [n][m];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              arr[i][j]=scan.nextInt();
          }
      } 

      //humne array input leliya hai ab 
      //ab hume dp array bnana hai for the storage purpose 
      Integer dp[][]=new Integer[n][m];
      
      dp[n-1][m-1]=arr[n-1][m-1];
//hum ne dp array bnaya , usko reverse traverse krte chlna hai 
      for(int i=n-1;i>=0;i--)
      {
          for(int j=m-1;j>=0;j--)
          {
            int down=Integer.MAX_VALUE;//we expect that the value is +infinity
            int right=Integer.MAX_VALUE;

            if((i+1<dp.length)&&dp[i+1][j]!=null)//down vale cell ki value mngvare hai hum
            {
              down=dp[i+1][j];//ye hojayegi down ki value ahgar down vala node hai to
            }
            if((j+1<dp[i].length)&&dp[i][j+1]!=null)
            {
              right=dp[i][j+1];//ye hojayegi right ki value agar right vala node hai to 

            }

            //fir hum compare krege down aur min me se kon chota hai.
            //jo b chota hoga  ,usme hum cell ki value add krege 

            int min=Math.min(down,right);//ye hogi min ki value 
            //ab min ki value to humne nikalli 
            dp[i][j]=min+arr[i][j];
            dp[n-1][m-1]=arr[n-1][m-1];
             
          }
      }
      System.out.println(dp[0][0]);

    }

}
