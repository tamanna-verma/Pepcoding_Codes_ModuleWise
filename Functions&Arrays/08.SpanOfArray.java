import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception 
{
  Scanner scan=new Scanner(System.in);
  int n=scan.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=scan.nextInt();
  } 
  int min=Integer.MAX_VALUE;
  int max=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++)
  {
      if(arr[i]<min)
      {
          min=arr[i];
      }
      if(arr[i]>max)
      {
          max=arr[i];
      }
  }
  System.out.println(max-min);
  }

}
