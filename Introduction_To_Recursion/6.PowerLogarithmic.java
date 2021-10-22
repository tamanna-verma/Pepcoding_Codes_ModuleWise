import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception     {  Scanner scan=new Scanner(System.in);
       int x=scan.nextInt();
       int n=scan.nextInt();
       int ans=power(x,n);
       System.out.println(ans);
    }

    public static int power(int x, int n)
    { 
      
       if(n==0)
       {
           return 1;
       }
       int xpnb2=power(x,n/2);
       int ans= xpnb2*xpnb2;
       if(n%2!=0)
       {
           ans=ans*x;
       }
       return ans;
    }

}
