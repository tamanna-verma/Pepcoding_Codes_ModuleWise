import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();//length of the array , we need to tell whether there is a subset of array that sums to target 

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        //we have taken the number as a input ;

        //now we need to take the target as input 
        int target =scan.nextInt();

       //so we will be solving using recursion

        boolean ans =CanMakeSubsetOfSumX(arr,0,target);
    System.out.println(ans);

    }

    public static boolean CanMakeSubsetOfSumX(int arr[], int idx, int target)
    {    
        if(target==0)//agar target 0 hogya hai to true return krdo
        {
            return true;

        }
        else if(target<0)//agar target -ve hogya hai to false return krdo
        {
            return false;
        }
        else if(idx>=arr.length && target>0)//agar pura array traverse krdliya hai aur abibi nhi hai target 0 to false return krdo 
        {
            return false;
        }
        
    
        
        boolean included= CanMakeSubsetOfSumX(arr,idx+1,target-arr[idx]);
        boolean excluded= CanMakeSubsetOfSumX(arr,idx+1,target);

        return included||excluded;
    }
} 
