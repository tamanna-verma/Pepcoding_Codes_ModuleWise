import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=scan.nextInt();
//maze to khali hoti hai to input array lene ki jrooratnhi
ArrayList<String>ans=getMazePaths(1,1,n,m);
//humne function me source row , source column , destination row aur destination column pass ki hai 
System.out.println(ans);
//ab jo b answer me string arraylist milegi (usme desired paths jonge sare, hume vo sare paths ko print krna hai )
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) 
    {
        //isme base case vo hoga jb source row aur source column destination row aur destination column jitne hojayege mtb jb b hum destination par phoch jayege , vo hoga base case 
    if(sr==dr&&sc==dc)
    {
        ArrayList<String> bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    //humne ek arraylist bnayi jisme sb horizontal ,vertical aur diagonal paths add hote jayege
     ArrayList<String> FinalPathsFromSToD=new ArrayList<>();
     
     //horizontal jumps ..maximum horizontal jump hoskta hai (dc-sc) size ka 
     for(int hjump=1;hjump<=dc-sc;hjump++)
     {
         //ye humara faith hai ki is initial spot se destination tk hume sb paths miljayege with the help of recursion
         ArrayList<String>hpaths=getMazePaths(sr,
         sc+
         hjump,dr,dc);
         
         for(String hpath:hpaths)
         {
           FinalPathsFromSToD.add("h"+hjump+hpath);  
         }
     }
       
      for(int vjump=1;vjump<=dr-sr;vjump++)
      {
          ArrayList<String>vpaths=getMazePaths(sr+vjump,
          sc,dr,dc);
          for(String vpath:vpaths)
          {
           FinalPathsFromSToD.add("v"+vjump+vpath);     
          }
          
      }
      
      
         for(int djump=1;djump<=dr-sr&&djump<=dc-sc;
         djump++)
      {
          ArrayList<String>dpaths=getMazePaths(sr+djump,
          sc+djump,dr,dc);
          for(String dpath:dpaths)
          {
           FinalPathsFromSToD.add("d"+djump+dpath);     
          }
          
      }
      
      return FinalPathsFromSToD;
    }

}
