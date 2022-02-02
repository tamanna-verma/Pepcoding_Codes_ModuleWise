import java.io.*;
import java.util.*;

public class Main
{

public static void main(String[] args) throws Exception 
{
    Scanner scan=new Scanner(System.in);
    
    int n1=scan.nextInt();
    int arr1[]=new int[n1];
    for(int i=0;i<n1;i++)
    {
       arr1[i]=scan.nextInt(); 
    }
    int n2=scan.nextInt();
    int arr2[]=new int[n2];
    for(int i=0;i<n2;i++)
    {
        arr2[i]=scan.nextInt();
    }
    
    
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int val:arr1)
    {
        if(hm.containsKey(val))
        {
            int oldValue=hm.get(val);
            int newValue=oldValue+1;
            hm.put(val,newValue);
        }
        else{
            hm.put(val,1);
        }
    }
    
    for(int val:arr2)
    {
       if(hm.containsKey(val)&&hm.get(val)>0)
        {
          
          System.out.println(val);
        int oldValue=hm.get(val);
        int newValue=oldValue-1;
        hm.put(val,newValue); 
        }
        
    }
    
    
 }

}
