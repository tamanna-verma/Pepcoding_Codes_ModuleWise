import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) throws Exception
    {

     Scanner scan= new Scanner(System.in);
     int n=scan.nextInt();
     int qb[]=new int[n+1];
     int ways=Paths( n);
     System.out.println(ways);

      
    }

    public static int Paths(int n)
    {
      int qb[]=new int[n+1];
      //tabulation mtlb iteration
      //iteration me 3 major rules hote hai 
      //storage and meaning , direction , travel and solve
      qb[0]=1;
      for(int i=1;i<=n;i++)
      {
     
        if(i==1)
        {
          qb[1]=qb[i-1];
         
        }
        else if(i==2)
        {
          qb[2]=qb[i-1]+qb[i-2];
          
        }
        else 
        {
          qb[i]=qb[i-1]+qb[i-2]+qb[i-3];
          
        }
      }   
     return qb[n];
    }

}
