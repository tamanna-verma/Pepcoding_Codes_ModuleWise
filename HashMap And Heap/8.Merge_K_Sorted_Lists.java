import java.io.*;
import java.util.*;

public class Main
{
    static class Pair implements Comparable//mtlb 2 pair k objects aapas me compare kiye jaskte hai  
    {
     int data;
     int li;//int list index
     int di;//int data index 
     
     //+ve -->this is bigger
     //-ve -->this is smaller
     //0 -->both are equal , dono pair ka data equal hai  
     public int compareTo(Object o)
     {
    Pair other=(Pair)o;//pair me typecast
       return this.data-other.data;//basically humne yebtaya hai ki hum data k base par compare krrhe hai 
     }
     
    }
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists)
   {
      ArrayList<Integer> rv = new ArrayList<>();
      PriorityQueue<Pair> pq=new PriorityQueue<>();
      //priority queue ko chahiye hota hai ki uske andar k sare elements ko hum compare karpaye 
    
    for(int li=0;li<lists.size();li++)
    {
        Pair p=new Pair();//p mtlb pair 
        p.li=li;
        p.di=0;
        p.data=lists.get(li).get(0);
        pq.add(p);
        
    }//humne sbhi lists k first elements ko pq me add krliya hai , ab hume in sb pq me se 
    
    while(pq.size()>0)//jb b peek elemets remove hoga , to jis li(list index) ka vo data tha , usi li ka next item add hoga humari pq me next element , mtlb li vhi rhega , di +1 hojayega 
    {
      Pair rp=pq.peek();
      pq.remove();
     rv.add(rp.data);
      
      if(rp.di+1<lists.get(rp.li).size())
      {
      Pair np=new Pair();//np mtlb new pair 
      np.li=rp.li;
      np.di=rp.di+1;
      np.data=lists.get(np.li).get(np.di);
      pq.add(np);
      }
      
    }
      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}
