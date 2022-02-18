import java.io.*;
import java.util.*;

public class Main
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
   int digit=scan.nextInt();
    for(int i=0;i<n;i++)
   {
    if(arr[i]==digit)
    {
        System.out.println(i);
        return;
    }

   }
   System.out.println(-1);

 }

}
