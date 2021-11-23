import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) 
  {
    //phle datewise sort krege fir hum month wise sort krege aur fir hum year wise sort krege //because dates ko dominate krta hai months aur months ko dominate krta hai years
    countSort(arr,1000000,100,32);
    
    //ab jb date wise sort ho gye hai to ab hume month wise sort krna hoga , to month wise sort krne k liye hume motnhs nkalne honge , month nikalne k liye divide by 10000,and mod by 100
    countSort(arr,10000,100,13);
    
    //ab jb month wise sort kr liya hai to ab hume finaly year wise sort krna hoga 
    countSort(arr,1,10000,2501);
  }

  public static void countSort(String[] arr,int div, int mod, int range)
  {
    //sbse phle frequency array bnao 
    
   //ab frequency array me values dalo
    
    int []farr=new int[range];
    String ans[]=new String[arr.length];
    
    for(int i=0;i<arr.length;i++){
        int value=Integer.parseInt(arr[i])/div%mod;
        //to aise value to milgyi ab value ko farr me daldo 
        farr[value]++;
        
    }
    //to farr to bnaliya , ab hume psa(prefix sum array )bnana hai jisme cumulative freq rhegi
    
    for(int i=1;i<range;i++)
    {
        farr[i]=farr[i]+farr[i-1];
    }
    
    //to ab cumulative freq array bhi bnaliya , to ab answer array me update values dalni hai 
    
    for(int i=arr.length-1;i>=0;i--)
    {
        int value=Integer.parseInt(arr[i])/div%mod;
        int position=farr[value];
        ans[position-1]=arr[i];
        farr[value]--;
    }
    
    for(int i=0;i<ans.length;i++)
    {
        arr[i]=ans[i];
    }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}
