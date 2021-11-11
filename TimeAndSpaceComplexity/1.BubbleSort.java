import java.io.*;
import java.util.*;

public class Main {

  public static void bubbleSort(int[] arr) 
  {
  for(int itr=1;itr<=arr.length-1;itr++)//ye loop journey k liye hai
  {
      
      for(int c=0;c<=arr.length-1-itr;c++)//ye loop comparisions k liye hai
      {
          if(isSmaller(arr,c+1,c)==true)//agar arr[j+1] is greater than arr[j], then we just need to swap them 
          {
              swap(arr,c+1,c);
          }
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

  // return true if ith element is smaller than jth element
  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    bubbleSort(arr);
    print(arr);
  }

}
