import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=scan.nextInt();

         }
         Arrays.sort(arr);
         int dup=-1;
         for(int i=0;i<=arr.length-2;i++)
         {
           if(arr[i]==arr[i+1])
           {
               dup=arr[i];
               break;
           }

         }
         System.out.println(dup);
    }
}
