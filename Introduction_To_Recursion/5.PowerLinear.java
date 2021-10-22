import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception     {
     Scanner scan=new Scanner(System.in);
     int x=scan.nextInt();
     int n=scan.nextInt();
     int ans=power(x,n);
     System.out.println(ans);
    }

    public static int power(int x, int n)
    {
        //ye function ka return type voide nhi hai to jab bhi hum koi recursive call lgayege to usko receive krna bhi jaroori hai vrna answer update hi nhi hoga
        if(n==0)
        {
            return 1;
        }
        int xpnm1=power(x,n-1);// x raise to the power n minus 1
        int xpn=xpnm1*x;//x raise to the power n;
        return xpn;
    }

}
