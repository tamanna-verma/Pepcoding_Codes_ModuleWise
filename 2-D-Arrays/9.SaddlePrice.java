import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args) throws Exception  
    {
     Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int Array[][] = new int[n][n];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        Array[i][j] = scan.nextInt();
      }
    }
    
    for(int i=0;i<Array.length;i++)//rows k liye
    {
     int minColumn=0;
    
     for(int j=0;j<Array[0].length;j++)//column k liye
        {
         if(Array[i][j]<Array[minColumn][j])//to us row me vo value milegi jo sbse choti hai
         {
           minColumn=j;
         
         }
        }
     boolean flag=true;
     for(int k=0;k<Array[0].length;k++)//rows k liye loop lagay hai kyuki us column me to rows change hogi na ab ye check krne                                          k liye ki kya vo us column me sbse bdi value h ya ni jo row me sbse choti hai vo vale
     {
        if(Array[k][minColumn]>Array[i][minColumn])
        {
            flag=false;
            break;
        }
     }
     if(flag==true)
     {
       System.out.println(Array[i][minColumn]);
       return;
     }
    }
    System.out.println("Invalid input");
    }
  }

