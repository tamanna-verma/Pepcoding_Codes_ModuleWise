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
       displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx)
    {
      if(idx==arr.length)
      {
          return;
      }
      System.out.println(arr[idx]);
      displayArr(arr,idx+1);
    }
    

}
