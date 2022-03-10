import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception
{

    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    
    int old_Zero=1;
    int old_One=1;

    for(int i=2;i<=n;i++)
    {
    int newOne=old_Zero+old_One;
    int newZero=old_One;

    old_Zero=newZero;
    old_One=newOne;
    }

    System.out.println(old_One+old_Zero);
    

}
}
