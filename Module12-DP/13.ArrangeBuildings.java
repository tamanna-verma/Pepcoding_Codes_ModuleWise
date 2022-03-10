import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception 
{
    Scanner scan=new Scanner(System.in);
    long n=scan.nextInt();
     
    long OldStrEndWB=1;
    long OldStrEndWS=1;
  
     
     for(int i=2;i<n+1;i++)
     {
      
       long newStrEndWS=OldStrEndWB+OldStrEndWS;
       long newStrEndWB=OldStrEndWS;

        OldStrEndWB = newStrEndWB;
       OldStrEndWS = newStrEndWS;
     }

    long RoadLeft=  OldStrEndWB+ OldStrEndWS;
    long total=RoadLeft*RoadLeft;
    System.out.println(total);
    
 }

}
