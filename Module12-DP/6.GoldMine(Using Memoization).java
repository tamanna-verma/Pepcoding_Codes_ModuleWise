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

       int dp[][]=new int[n][m];//ye humne storage 2 d array bnaya 
       
       int j=0;
       for(int i=0;i<n;i++)
       {
        if(i==0)//mtlb agar row 0 hai
        { 
         int Right= getMaxGold(i,j+1,dp,arr);
         int RightDown=getMaxGold(i+1,j+1,dp,arr);
         dp[i][0]=Math.max(Right,RightDown)+arr[i][0];

        }
        else if(i==n-1)//agar row last vali hai to
        {
         int Right= getMaxGold(i,j+1,dp,arr);
         int RightUp=getMaxGold(i-1,j+1,dp,arr);
         dp[i][0]=Math.max(Right,RightUp)+arr[i][0];
 
        }
        else //agar aur koi row hai to 
        {
         int Right= getMaxGold(i,j+1,dp,arr);
         int RightDown=getMaxGold(i+1,j+1,dp,arr);
         int RightUp=getMaxGold(i-1,j+1,dp,arr);
         dp[i][0]=Math.max(RightUp,Math.max(Right,RightDown))+arr[i][0]; 

        }
       
                    
       }    
        //ab hume kya krna hai ?

int MaxGold=0;
for(int i=0;i<n;i++)
{
    if(dp[i][0]>MaxGold)
    {
        MaxGold=dp[i][0];
    }
}

 System.out.println(MaxGold);     
}
    
    public static int getMaxGold(int row , int col , int dp[][], int arr[][])
    {
        //humare pas dp array hai aur humare pas hai given ek array jo ki 2 d array hai 
        if(dp[row][col]!=0)
        {
            return dp[row][col];
        }
        else if(col==dp[0].length-1)//agar col hai last col 
        {
         return dp[row][col]=arr[row][col];
        }
        else if(row==0)
        {

         int Right= getMaxGold(row,col+1,dp,arr);
         int RightDown=getMaxGold(row+1,col+1,dp,arr);
         dp[row][col]=Math.max(Right,RightDown)+arr[row][col];
   
        }
         else if(row==dp.length-1)//agar row last vali hai to
        {
         int Right= getMaxGold(row,col+1,dp,arr);
         int RightUp=getMaxGold(row-1,col+1,dp,arr);
         dp[row][col]=Math.max(Right,RightUp)+arr[row][col];
 
        }
        else 
        {
         int Right= getMaxGold(row,col+1,dp,arr);
         int RightDown=getMaxGold(row+1,col+1,dp,arr);
         int RightUp=getMaxGold(row-1,col+1,dp,arr);
         dp[row][col]=Math.max(RightUp,Math.max(Right,RightDown))+arr[row][col]; 

        }
        return dp[row][col];

    }
}
