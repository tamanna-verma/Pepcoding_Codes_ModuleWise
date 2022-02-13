import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   static class Pair implements Comparable<Pair> {
      int wsf;//weight so far
      String psf;//path so far

      Pair(int wsf, String psf){
         this.wsf = wsf;
         this.psf = psf;
      }

      public int compareTo(Pair o)//Minimum priority queue k liye hai ye 
      {
         return this.wsf - o.wsf;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      int criteria = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      boolean[] visited = new boolean[vtces];
      multisolver(graph, src, dest, visited, criteria, k,src + "", 0);
      
      System.out.println("Smallest Path = " + spath + "@" + spathwt);
      System.out.println("Largest Path = " + lpath + "@" + lpathwt);
      System.out.println("Just Larger Path than " + criteria + " = " + cpath + "@" + cpathwt);
      System.out.println("Just Smaller Path than " + criteria + " = " + fpath + "@" + fpathwt);
      System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
   }



   static String spath;//smallest path
   static Integer spathwt = Integer.MAX_VALUE;//smallest path weight 


   static String lpath;//largest path 
   static Integer lpathwt = Integer.MIN_VALUE;//largest path weight

   static String cpath;//ceil path
   static Integer cpathwt = Integer.MAX_VALUE;//ceil path weight


   static String fpath;//floor path
   static Integer fpathwt = Integer.MIN_VALUE;//floor path weight


   static PriorityQueue<Pair> pq = new PriorityQueue<>();
   public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k, String psf, int wsf) 
   {
      if(src==dest)
      {
        if(wsf<spathwt)//agar weightsofar smallestpathweight se chota hai to 
        {
           spath=psf;//smallest path ho jayega pasth so far 
           //aur smallest path weight me aajayega weight so far 
           spathwt=wsf;
        }
        
        if(wsf>lpathwt)//agar weight so far largest path weight se bda hai 
        //to largest path hojayega path so far
        //largest path weight hojayega  largest path weight 
        {
           lpath=psf;
           lpathwt=wsf;
        }

        if(wsf>criteria && wsf<cpathwt)//agar criteria se bda hai wsf
        // aur ceil path weight se chota hai to ceilpathweight hojayega wsf
        //aur ceilpath hoajayega pathsofar 
        {
           cpathwt=wsf;
           cpath=psf;
        }

        if(wsf<criteria && wsf>fpathwt)//agar criteria se chota hai wsf
        // aur floor path weight se bda hai to floorpathweight hojayega wsf
        //aur floorpath hoajayega pathsofar

        {
           fpathwt=wsf;
           fpath=psf;
        }

       if(pq.size()<k)
       {
        pq.add(new Pair(wsf,psf));
       }

       else
       {
               if(wsf>pq.peek().wsf)
               {
               pq.remove();
               pq.add(new Pair(wsf,psf));

               }
       }



      }

      visited[src]=true;//jis bhi vertex oe hum aaye us true marh krte chlo 
//fir source k sbhi neighbours pe recursively travel krna hoga 

for(int i=0;i<graph[src].size();i++)
{
   Edge e=graph[src].get(i);
   int nbr=e.nbr;


   //ab neighbour ek to milgya , ab sbhi neighbours pe recursive call lgegi 
if(visited[nbr]==false)
{
   multisolver(graph,nbr,dest,visited,criteria,k,psf+e.nbr,wsf+e.wt);
}


}


visited[src]=false;



   }
}
