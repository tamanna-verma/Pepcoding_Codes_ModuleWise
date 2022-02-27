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
    int qb[]=new int[n+1];
    qb[n]=1;
   
    int ans=ClimbStairs(0, arr, qb);
    System.out.println(ans);
    }

    public static int ClimbStairs(int x, int arr[],int []qb)
    {
      
      if(qb[x]!=0)
      {
          return qb[x];
      }
      else
      {
        int jumps=arr[x];
        int ans=0;
        for(int i=1;i<=jumps && x+i<=arr.length;i++)
        {
            ans+=ClimbStairs(i+x,arr,qb);//recursion is used
        }
        qb[x]=ans;
        return qb[x];
      }

    }

}
