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
      //this function will return me the first index of occurence of an element in the array
     int ans= firstIndex(arr,0,x);
     System.out.println(ans);
        
    }
   public static int firstIndex(int[] arr, int idx, int x)
   {
        //this function will give the first index in the smaller array
        
        if(idx==arr.length)
        {
            return -1;
        }
        if(arr[idx]==x)
        {
            return idx;
        }
        else
        {
           return  firstIndex(arr,idx+1,x);
        }
        //return -1;
   }

}
