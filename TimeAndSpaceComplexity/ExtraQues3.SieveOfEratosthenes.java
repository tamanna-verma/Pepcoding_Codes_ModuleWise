import java.util.*;
import java.io.*;
public class Main
//is question me hume n tak k prime print krne hote hai 
{
    public static void main(String args[])
   {
   Scanner scan=new Scanner(System.in);
   //to humne n input leliya 
   //ab hume ek array bnana hoga n+1 size ka 
   //vo ek boolean array hoga 
   //us array me sbse phle false values pdi hogi 
   // to phle har jgh false pda hai to hume vha true dalna hai jo kisise divide hojaye , vo prime honge // hume non prime partrue dalna hai
   // vha false hoga jo sb prime honge 
   //to ab hume divisor nikalne hoge jinse hume array k har ek index ko divide krke dekhna hoga taki ye pta chljaye ki vo index divisor ka multiple hai 
   
   int n=scan.nextInt();
   boolean []arr=new boolean[n+1];
   //to humne boolean array bnaliya 
   //boolean array me by default false pda hota hai 
   //ab hume divisors chahiye //divisor vhi honge jo ki         false honge ,matlab jo khud prime honge 
   //divisor will be less than root(n)
   //divisor hoga root n se kam //divisor 0 aur 1 to ho hi      nhi skte kyuki 0 aur 1 phle se hi prime hai   
   for(int div=2; div*div < arr.length ;div ++)
   {  
      if(arr[div]==false)
//agar divisor khud false hoga //mtlb agar khud prime hoga to hi vo divide krskta hai index ko 
      {
         for(int i=div;i*div<arr.length;i++)
         //ye divisor k sare multiple tk jayega jo b 
         //arr.length se km hai
         {
           
//agar vo index divisor se divide hojaye to index value vali ko true bnado 
            
               arr[i*div]=true;
         }
     }
   }
     
      for(int i=2;i<arr.length;i++)
      {
        if(arr[i]==false)
            {
              System.out.println(i);
            }  
      }

   }
}
