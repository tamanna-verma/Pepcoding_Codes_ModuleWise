import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ans =factorial(n);
        System.out.print(ans);
    }

    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int factorial= n* factorial(n-1);
        return factorial; //factorial;
    }

}
