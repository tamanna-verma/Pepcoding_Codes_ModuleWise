import java.io.*;
import java.util.*;

public class Main
 {

    public static void main(String[] args) throws Exception
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();//humne no. of coins input liye 
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++)
        {
         arr[i]=scan.nextInt();//humne coins denomination input liye 
        }
        int amount=scan.nextInt();
        int []dp=new int[amount+1];//humne ek dp array bnaya amount+1 size ka 
        dp[0]=1;
        //ab hume outer loop lgana hai coins k upr aur dp array ko fill krna hoga
//0 rupee ko pay krne ka 1 combination hoga 
        for(int i=0;i<n;i++)
        {

          //agar coin hai 3 
           for(int j=arr[i];j<dp.length;j++)
           {
             //agar bhyi arr[i]<j//sikka agar paiso k equal hai ya chota hai t hi hum pay krskte hai 
              
                //agar j=5 , 5-3 
                
                 dp[j]+=dp[j-arr[i]];
                
              
           }
          
        }
        System.out.println(dp[amount]);
    }
}
