import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max)   {
   int range=max-min+1;
   int farr[]=new int[range];
   int ans[]=new int[arr.length];
   
   //hume frequency array bnana hai 
   for(int i=0;i<arr.length;i++)
   {
       farr[(arr[i])-min]++;
   }
   
   //hume cumulative frequency array bnana hai 
   //cumulative frequency will be the sum of previous freq      and current freq
   for(int i=1;i<farr.length;i++)
   {
       farr[i]+=farr[i-1];
   }
   
   
  //ab humne cumulative frquency ka array bhi bnaliya hai 
  //ab hume cumulative freq k array ki help se fill krna       hoga answer array
  //answer array ko fill krna hoga position-1 index par 
  //position will be farr[value-min]
  //[5,3,7,3,5,7,2,5,2,7,6,5,6]  //this is given array
  //[2,4,4,8,10,13] //2,3,4,5,6,7 //this is cumulative         frequency array
  //6 k liye farr[6-2]=farr[4]
  
  for(int i=arr.length-1;i>=0;i--)
  {
     int value=arr[i];
     int position=farr[value-min];//farr[4]
     ans[position-1]=value;//13-1=ans[12]pe jayege arr[i]
     farr[value-min]--;
     //6,2 hai min to position hoyegi 
  }
  
  //fill the original array 
  for(int i=0;i<arr.length;i++)
  {
      arr[i]=ans[i];
  }
  
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}
