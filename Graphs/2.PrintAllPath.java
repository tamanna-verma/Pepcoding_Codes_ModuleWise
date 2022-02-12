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

   public static void PrintAllPath(ArrayList<Edge>[]graph,int source,int destination,Boolean[] visited, String psf)
   {
      if(source==destination)//agar source aur destination equal hai to simply true return krdo 
      {
         System.out.println(psf+source);

      }
    //fir hum recursive call lagayege source k neighbour pe

    visited[source]=true;

    for(int i=0;i<graph[source].size();i++)
    {
      Edge e=graph[source].get(i);
      int neighbour=e.nbr;

      if(visited[neighbour]==false)
      {
      PrintAllPath(graph,neighbour,destination,visited,psf+source);
      }
    }
    visited[source]=false;


   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vertices = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vertices];
      for (int i = 0; i < vertices; i++) {
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

      // write all your codes here

   Boolean visited[]=new Boolean[vertices];
   for(int i=0;i<visited.length;i++)
   {
      visited[i]=false;
   }
   String psf="";
   PrintAllPath(graph, src,dest,visited,psf);//humne puri AL leli input ,aur source aur destination bhi pass krdiya   
  
   }


}
