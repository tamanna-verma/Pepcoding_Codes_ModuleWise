import java.io.*;
import java.util.*;

public class Main
 {

    public static void main(String[] args) throws Exception
    {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();//no of rows
       int m=scan.nextInt();//no. of columns

       int arr[][]=new int[n][m];
      for(int i=0;i<n;i++)//humne given array ko input liya 
       {
           for(int j=0;j<m;j++)
           {
               arr[i][j]=scan.nextInt();
           }
       }

       int dp[][]=new int[n][m];

      
       for(int j=m-1;j>=0;j--)//column reverse me traverse honge
       {
           for(int i=0;i<=n-1;i++)//aur row hogi traverse straight
           {
            
            if(j==m-1)//agar column last vala hai 
            {
                dp[i][j]=arr[i][j];
            }
            else if(i==0)//agar row start wali hai
            {
                dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1])+arr[i][j];
            }
            else if(i==n-1)//agar row last vali hai to
            {
                dp[i][j]=Math.max(dp[i-1][j+1],dp[i][j+1])+arr[i][j];
            }
            else //baki k sbhi cells me teeno ko compare krna hai
            {
               dp[i][j]=Math.max(dp[i+1][j+1],Math.max(dp[i-1][j+1],dp[i][j+1]))+arr[i][j]; 
            }
        }
        //ab humne dp array ko fill krliya hai 
      }
        int max=Integer.MIN_VALUE;
        int j=0;
       for(int i=0;i<n-1;i++)
       {
          if(max<dp[i][j])
          {
           max=dp[i][j];
          }
       } 
       System.out.println(max);
       
    }

}
