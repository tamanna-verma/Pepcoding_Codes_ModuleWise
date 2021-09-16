import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int StartGap=0;
        int MiddleGap=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<StartGap;j++)
            {
                System.out.print("	");
            }
            System.out.print("*");
             for(int j=0;j<MiddleGap;j++)
            {
                System.out.print("	");
            }
            if(i!=n/2)
            {
            System.out.print("*");
            }
            System.out.println();
            if(i<n/2)
            {
                StartGap++;
                MiddleGap=MiddleGap-2;
            }
            else
            {
                StartGap--;
                MiddleGap=MiddleGap+2;
            }
            
        }
    }
}
