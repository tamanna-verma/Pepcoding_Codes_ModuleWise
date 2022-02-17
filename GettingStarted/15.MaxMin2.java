import java.io.*;
import java.util.*;

public class MaxMin2 
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
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;

    for(int i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];

      }
      if(arr[i]<min)
      {
        min=arr[i];
        
      }
    }
//to bhyi humare pas max aur min ki value aagyi hai 
 int SecondMax=Integer.MIN_VALUE;
 int SecondMin=Integer.MAX_VALUE;
for(int i=0;i<n;i++)
{
  if(arr[i]>SecondMax && arr[i]<max)
  {
    SecondMax=arr[i];
  }
  if(arr[i]<SecondMin && arr[i]>min)
  {
   SecondMin=arr[i];
  }
}
System.out.println(SecondMax);
System.out.println(SecondMin);

  }
}
