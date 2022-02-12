import java.io.*;
import java.util.*;

public class Main 
{
   static class Edge
    {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt)
      {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
public static Boolean  hasPath(ArrayList<Edge>[] graph , int src,int destination,Boolean[] visited)
{
    if(src==destination )//agar bhyi src aur destination hai qual to hum bas true krdege return  
    {
        return true;//ye generic tree me puchte the ki kya node.data data k equal hai ya nhi hai   agar ye node data k eqal nhi hai to node k children se puchte the
    }
    visited[src]=true;
    for(int i=0;i<graph[src].size();i++)//hum graph me source vali arraylist ko hi visit krege 
    {
    Edge neighbour=graph[src].get(i);//humne src index vali arraylistse edge nikali
    int neighbourValue=neighbour.nbr;//humne edge ka destination vertex nikali 
    if(visited[neighbourValue]==false)
    {
        boolean hasNbrPath=hasPath(graph,neighbourValue,destination,visited);//is the Destination of edge a direct neighbour of source
        if(hasNbrPath==true)
        { 
            return true; 
        }
    }
    
 
}
  return false;
}

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vertices = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vertices];
      for(int i = 0; i < vertices; i++){
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for(int i = 0; i < edges; i++){
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      // write your code here

   Boolean visited[]=new Boolean[vertices];
   for(int i=0;i<visited.length;i++)
   {
      visited[i]=false;
   }
   Boolean ans=hasPath(graph, src,dest,visited);//humne puri AL leli input ,aur source aur destination bhi pass krdiya   
   System.out.println(ans);
      }

   }
