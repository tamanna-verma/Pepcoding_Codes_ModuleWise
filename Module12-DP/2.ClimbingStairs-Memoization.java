import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) throws Exception
    {

     Scanner scan= new Scanner(System.in);
     int n=scan.nextInt();
     int qb[]=new int[n+1];
     int ways=Paths( n,  qb);
     System.out.println(ways);

      
    }

    public static int Paths(int n, int [] qb)
    {
      if(n==0)
      {
        qb[0]=1;
        return 1 ;
       
      }
      else if(n<0)
      {
        return 0;
      }
      if(qb[n]!=0)
      {
        return qb[n];
      }
       int nm1=Paths(n-1,qb);
       int nm2=Paths(n-2,qb);
       int nm3=Paths(n-3,qb);
       qb[n]=nm1+nm2+nm3; 
       return qb[n];    

    }

}
