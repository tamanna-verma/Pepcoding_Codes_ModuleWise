import java.util.*;
public class Main{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
     for(int i=0;i<n;i++)//yhape n size ka array input liya
     {
       arr[i]=scan.nextInt();
     }
        Integer dp[]=new Integer[n+1];//ek array bnaya hai to store the question bank 
        dp[n]=0;

      for(int i=n-1;i>=0;i--)//TO TRAVEL ON THE ARRAY ARR
       {   
        if(arr[i]>0)//agar 0 pda hai ARR  to vo khi ni jaskta , NULL WILL  BE STORED
        {
         int Min =Integer.MAX_VALUE;   
          for(int j=1;j<=arr[i] && i+j<dp.length;j++)
          {
            if(dp[i+j]!=null)//agar question bank me hum store krate chl rhe hai no. of 
            {
              Min=Math.min(Min, dp[i+j]);
            }
          }

            if(Min!=Integer.MAX_VALUE)
            {
              dp[i]= Min + 1;
            }
            else
            {
              dp[i]=null;
            }
        } 
        
     }
   System.out.println(dp[0]);


  }
}
