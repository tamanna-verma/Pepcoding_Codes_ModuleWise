import java.util.*;

public class Main
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int val:arr)
        {
            hm.put(val,true);//initially we are assuming that each digit is itself a starting point of a sequence 
            
        }
        
        for(int val:arr)
        {
            int previousDigit=val-1;
            if(hm.containsKey(previousDigit))
            {
                hm.put(val,false);
            }
        }//ab jo true vale bachege it means they are the starting point of a sequence 
        
        int LSP=0;//largest starting point
        int LSize=0;//largest sequence size 
        for(int val:arr)
        {
            if(hm.get(val)==true)//agar true hai value , it means ,it is the start of a sequence and therfore , we need to find out the sequence we have for it , in the hashmap 
            {
            int tsp=val;//temporary starting point
            int tsl=1;//temporary sequence length hai 1 
             while(hm.containsKey(tsp+tsl)==true)
             {
                 tsl++;
             }
             if(tsl>LSize)
             {
                 LSize=tsl;
                 LSP=tsp;
             }
            }
        }
        for(int i=0;i<LSize;i++)
        {
            System.out.println(LSP+i);
        }
    }
}
