import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr)
  {
     int max=arr[0];
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]>max)
         {
             max=arr[i];
         }
     }
     //to hume max milgya
     //ab hume place change kr karke har ek place k liye count sort krna hai ,jab tak max number/place value 0 se bdi hai 
     
     int place=1;
     while(max/place>0)
     {
         countSort(arr,place);
         place=place*10;
     }
  }

  public static void countSort(int[] arr, int place) 
  {
    int farr[]=new int[10];//farr bnaya 
    int ans[]=new int[arr.length];//ans array bnaya 
    
    //ab hume frequency array bnana hai
    
    for(int i=0;i<arr.length;i++)
    {
        int value=arr[i]/place%10;
        farr[value]++;
        
    }
    
    //to frequency array to bngya 
    //to ab frequency array bnne k bad hume us frequency array ko conver krna hai into prefix sum array
    for(int i=1;i<farr.length;i++)
    {
      farr[i]=farr[i-1]+farr[i];  
    }
    //so prefix sum array bhi bngya hai
    
    //ab prefix sum array bnne k bad 
    //ab hume answer array ko sort krne k bad ab answer array me values dalni hai jo ki correct values hongi 
    //
    for(int i=arr.length-1;i>=0;i--)
    {
     int value=arr[i]/place%10;//to merko yhape 6 milgya lets say
     int position=farr[value];
     ans[position-1]=arr[i];//agar 13 mila to 12th position par vo value dalni hai
     farr[value]--;
    }
    for(int i=0;i<ans.length;i++)
    {
        arr[i]=ans[i];
    }
    System.out.print("After sorting on " + place + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}
