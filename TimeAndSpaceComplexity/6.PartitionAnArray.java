import java.io.*;
import java.util.*;

public class Main {

  public static void partition(int[] arr, int pivot)
  {  
     int i=0,j=0;
     //hume 3 regions bnane hai mainly 
     //ek hoga lesser than pivot area , ek hoga greater than pivot area ,aur 3rd hoga unknown area
     //jab tak i n se chota hai tab tak hume loop chalana hai 
     //iska mtlb jbtk unknown area me elements bache hai tb tk loop chalega 
     while(i<arr.length)
     {
       if(arr[i]>pivot)//agar element pivot se bda hai to hume i++ bda krna hai  
       {
           i++;
       }
       else//otherwise hume swap bhi krna hai arr[i]aur arr[j],i bhi bdega aur j bhi bdega 
       {
           swap(arr,i,j);
           i++;
           j++;
       }
     }
     
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
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
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}
