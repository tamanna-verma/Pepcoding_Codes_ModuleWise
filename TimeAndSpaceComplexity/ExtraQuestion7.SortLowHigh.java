import java.io.*;
import java.util.*;

public class Main 
{
  public static void sortLowHigh(int[] arr,int low ,int high)
  {
    int i=0;
    int j=0;
    int k=arr.length-1;
    
    while(i<=k)
    {
        if(arr[i]<low)
        {
         swap(arr,i,j);
         j++;
         i++;
        }
        else if (arr[i]>=low&&arr[i]<=high)
        {
         i++;   
        }
        else
        {
          swap(arr,i,k);
          k--;
        }
        
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++)
    {
      arr[i] = scan.nextInt();
    }
    
    int low=scan.nextInt();
    int high=scan.nextInt();
    
    sortLowHigh(arr,low,high);
    print(arr);
  }

}
