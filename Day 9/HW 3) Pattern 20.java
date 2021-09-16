import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int StartSpace = (n / 2) - 1;
    int MidSpace = 2;
    if (n == 1) 
    {
      System.out.print("*");
    }
    else if (n > 1)
    {
      for (int i = 1; i <= n; i++)
      {
        if (i <= n / 2)
        {
          System.out.print("*");
          
          for (int j = 1; j <= n - 1; j++)
          {
            System.out.print("	");
          }

          System.out.println("*");

        }
        else if (i == (n / 2) + 1)
        {
          System.out.print("*");

          for (int j = 1; j <= n / 2; j++)
          {
            System.out.print("	");
          }
          System.out.print("*");

          for (int j = 1; j <= n / 2; j++)
          {
            System.out.print("	");
          }
          System.out.println("*");
        }
        else if (i > n / 2 && i < n)
        {
          System.out.print("*");
          for (int j = 1; j <= StartSpace; j++)
          {
            System.out.print("	");
          }
          System.out.print("*");
          for (int j = 1; j <= MidSpace; j++)
          {
            System.out.print("	");
          }
          System.out.print("*");
          for (int j = 1; j <= StartSpace; j++)
          {
            System.out.print("	");
          }
          System.out.println("*");
          StartSpace--;
          MidSpace = MidSpace + 2;
        }
        else if (i == n)
        {
          System.out.print("*");

          for (int j = 1; j <= n - 1; j++)
          {
            System.out.print("	");
          }
          System.out.println("*");

        }
      }
    }

  }
}
