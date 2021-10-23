import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception     {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=scan.nextInt(); 
        }
        int x=scan.nextInt();
        int ans=lastIndex(arr,arr.length-1,x);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x)
    {
       if(idx<0)
       {
           return -1;
       }
       if(arr[idx]==x)
       {
           return idx;
           
       }
       else
       {
           return lastIndex(arr,idx-1,x);
       }
    }

}
