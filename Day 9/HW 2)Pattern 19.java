import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    for (int i = 1; i <= n; i++)
    {
      if (i == 1)
      {
        for (int j = 1; j <= n / 2 + 1; j++)
        {
          System.out.print("*	");
        }
        for (int j = 1; j < n / 2; j++)
        {
          System.out.print("	");
        }
        System.out.println("*");

      }
      else if (i > 1 && i < (n / 2)+1)
      {
        for (int j = 1; j <=n / 2; j++)
        {
          System.out.print("	");
        }
        System.out.print("*");

        for (int j = 1; j <= n / 2; j++)
        {
          System.out.print("	");
        }
        System.out.println("*	");

      }
      else if (i == (n / 2)+1)
      {
        for (int j = 1; j <= n ; j++)
        {
          System.out.print("*	");
        }
        System.out.println();
      }
      else if (i > (n / 2)+1 && i<=n - 1)
      {
        System.out.print("*");

        for (int j = 1; j <= n / 2; j++)
        {
          System.out.print("	");
        }
        System.out.println("*");
      }
      else if (i == n)
      {
        System.out.print("*");

        for (int j = 1; j <= n / 2; j++)
        {
          System.out.print("	");
        }
        for (int j = 1; j <= n / 2 + 1; j++)
        {
          System.out.print("*	");
        }
      }
    }
  }
}
