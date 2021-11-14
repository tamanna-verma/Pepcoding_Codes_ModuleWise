import java.util.Scanner;
import java.util.*;


public class TargetSumTriplet {
   
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int target=scan.nextInt();
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }  
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++)
        {
            //now we are searching for new target k pairs  /subarray me pairs dhundne hai
            int newtarget=target-arr[i];
            int j=i+1;  //subarray start yhase hoga
            int k=arr.length-1; //subarray end yhape hoga
            

            //ab hume target sum pair vala logic lgana hoga
            while(j<k)
            {
                if(arr[j]+arr[k]<newtarget)
                {
                    j++;   //right index --

                }    
                else if(arr[j]+arr[k]>newtarget)  
                {
                    k--;    //left index ++
                }  
                else
                {
                  System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                  j++;
                  k--;
                }
            }
             
        }
    }
}
