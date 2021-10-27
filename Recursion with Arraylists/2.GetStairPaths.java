import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception    {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    ArrayList<String> ans=getStairPaths(n);
    System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n)
    {
      if(n==0)
      {
         ArrayList<String> bres=new ArrayList<>();
         bres.add("");
         return bres;
      }
      else if(n<0)
     {
       ArrayList<String> bres=new ArrayList<>();
         return bres;  
     }
      
      ArrayList<String> pathsfromnm1=getStairPaths(n-1);
      ArrayList<String> pathsfromnm2=getStairPaths(n-2);
      ArrayList<String> pathsfromnm3=getStairPaths(n-3);
      
      ArrayList<String> myans=new ArrayList<>();
      for(String pathfromnm1:pathsfromnm1)
      {
        myans.add("1"+pathfromnm1); 
      }
      for(String pathfromnm2:pathsfromnm2)
      {
        myans.add("2"+pathfromnm2); 
      }
      for(String pathfromnm3:pathsfromnm3)
      {
        myans.add("3"+pathfromnm3); 
      }
      return myans;
    }

}
