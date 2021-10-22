import java.util.*;

public class Main {

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int space = (n / 2) - 1;
    int stars = 3;
    int count=n-4;
    for (int i = 0; i < n; i++)
    {
      int midspace = n - i - 2;
      if (i <= n / 2)
      {
        if (i == 0)
        {
          for (int j = 0; j < n; j++)
          {
            System.out.print("*	");
          }
        }
        else if (i == (n / 2))
        {
          for (int j = 0; j < n / 2; j++)
          {
            System.out.print("	");
          }
          System.out.print("*	");
          space = (n / 2) - 1;

        }
        else
        {

          for (int j = 0; j < i; j++)
          {
            System.out.print("	");

          }
          System.out.print("*	");

          for (int j = 0; j < count; j++)
          {
            System.out.print("	");
            
          }
          count=count-2;
          System.out.print("*");
        }

      }
      else
      {
        for (int j = 0; j < space; j++)
        {
          System.out.print("	");
        }
        for (int j = 0; j < stars; j++)
        {
          System.out.print("*	");
        }
        stars = stars + 2;
        space = space - 1;
      }
      System.out.println();
    }

  }
}
