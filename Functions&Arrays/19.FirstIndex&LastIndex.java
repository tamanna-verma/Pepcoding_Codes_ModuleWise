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
    int d=scan.nextInt();
    int first=-1;
    int last=-1;
   
    for(int i=0;i<n;i++)
    {
      if(arr[i]==d)
      {
         if(first==-1)
         {
           first=i;
         }
         last=i;

      }

    }
        System.out.println(first);
         System.out.println(last);
 }

}
