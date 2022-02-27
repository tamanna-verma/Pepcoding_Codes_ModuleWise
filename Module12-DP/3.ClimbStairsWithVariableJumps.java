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
    //har step se hum different number of steps leskte hai 
    //hume btana hai 0 se n tk k number of paths
    
    int dp[]=new int[n+1];
    dp[n]=1;
        for(int i=n-1;i>=0;i--)//ye vala loop ulta chlega taki hum answer store krate chle
        {
         for(int j=1;j<=arr[i];j++)
         {
             if(i+j<n+1)
             {
              dp[i]+=dp[i+j];
             }
         
         }
        }
        System.out.println(dp[0]);

    }

}
