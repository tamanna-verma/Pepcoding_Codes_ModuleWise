import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) throws Exception {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=scan.nextInt();
printMazePaths(1,1,n,m,"");

}

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) 
    {
    //agar source row destination row se bdi hojaye ya source columne destination column se bdi hojaye then we just need to return
      if(sr>dr||sc>dc)
      {
          return;
      }
  //agar source row destination row k equal  hoajye ya source columne destination column k equal hojaye then we need to print the path so far and return    
      if(sr==dr&&sc==dc)
      {
          System.out.println(psf);
          return;
      }
    // if we want to increase column numbers (1 to n) and then print the paths 
      for(int i=1;i<=(dc-sc);i++)
      {
        printMazePaths(sr,sc+i,dr,dc,psf+'h'+i);  
      }
      for(int i=1;i<=(dr-sr);i++)
      {
        printMazePaths(sr+i,sc,dr,dc,psf+'v'+i);  
      }
       for(int i=1;i<=(dr-sr)&&i<=(dc-sc);i++)
      {
        printMazePaths(sr+i,sc+i,dr,dc,psf+'d'+i);  
      }
    }

}
