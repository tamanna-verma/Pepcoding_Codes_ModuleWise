import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();//length of the array , we need to tell whether there is a subset of array that sums to target 

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        //we have taken the number as a input ;

        //now we need to take the target as input 
        int target =scan.nextInt();

        //now we need to create the 2 d array 
         boolean dp[][]=new boolean [n+1][target+1];//humne n+1 row rkhi hai 
        //0th row is for empty subset 

        for(int i=0;i<dp.length;i++)
        { 
          for(int j=0;j<dp[0].length;j++)
          {
              if(i==0&&j==0)
               {
               dp[i][j]=true;
              }
              else if(i==0)//agar row 0 hai to 
              {
                 dp[i][j]=false;
              }
              else if(j==0)
              {
                  dp[i][j]=true;
              }
              else 
              {
                  if(dp[i-1][j]==true)
                  {
                      dp[i][j]=true;
                  }
                  else 
                  {
                     int val=arr[i-1];
                     if(j>=val)
                     {
                         if(dp[i-1][j-val]==true)
                         {
                             dp[i][j]=true;
                         }
                     }
                     
                  }
              }
           }
          
        }
       System.out.println(dp[arr.length][target]);

    }
} 
