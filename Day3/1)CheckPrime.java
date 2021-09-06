import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t > 0)
    {
      int n = scn.nextInt();
      if (n == 1)
      {
        System.out.println("prime");

      }
      else if (n == 2)
      {
        System.out.println("prime");

      }
      else if (n % 2 == 0)
      {
        System.out.println("not prime");

      }
      else
      {
        int  flag = 0;
        for (int i = 2; i * i <= n; i++)
        {
          if (n % i == 0)
          {
            flag = 1;
            break;
          }
        }
        if (flag == 1)
        {
          System.out.println("not prime");
        }
        else
        {
          System.out.println("prime");
        }
      }
      t--;
    }
  }
}
