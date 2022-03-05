import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) throws Exception 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=scan.nextInt();
        }
        //humne input liya array of coins
        //ab hume coins k permutation nikalni hai jo sum bnayege 
        int amount=scan.nextInt();
        int dp[]=new int[amount+1];
        dp[0]=1;
        for(int amt=1;amt<=amount;amt++)//sum 
        {
          for(int coin=0;coin<n;coin++)//ye array lagega 
          {
             if(amt>=arr[coin])
             {
                 dp[amt]+=dp[amt-arr[coin]];
             }
          }
        }
        System.out.println(dp[amount]);

    }
}
