import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) 
      {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      PriorityQueue<Integer> pq=new PriorityQueue<>();//to humne ek priority queue bnayi 
      
      for(int i=0;i<k+1;i++)
      {
          pq.add(arr[i]);
      }
      int index=k+1;
      while(pq.size()>0)//jbtk priority queue ka size 0 se jada hai tbtk loop chlega aur ek ek element remove hota jayega pq me se 
      {
         System.out.println(pq.remove());
         if(index<arr.length)//add hum tb hi krege jb index km valid ho
         {
          pq.add(arr[index]);
         }
          index++;
      }
      
   }

}
