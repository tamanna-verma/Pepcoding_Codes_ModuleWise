import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int ans=n;
        for(int i=1;i<=10;i++)
        { ans=i*n;
            System.out.println(n+" * "+i+" = "+ans);
        }

    }
}
