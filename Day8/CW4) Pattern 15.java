import java.util.*;

public class Main
{

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int space = n / 2;
    int digits = 1;
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= space; j++)
      {
        System.out.print("	");
      }

      if (i <= n / 2)
      {
        int print = i;
        for (int j = 1; j <= digits; j++)
        {
          System.out.print(print + "	");
          if (j < ((digits) / 2)+1)
          {
            print++;
          }
          else
          {
            print = print - 1;
          }
        }
      }
      else
      {
        int print = n - i + 1;
        for (int j = 1; j <= digits; j++)
        {
          System.out.print(print + "	");
          if (j < ((digits) / 2)+1)
          {
            print++;
          }
          else
          {
            print--;
          }
        }
      }
      if (i <= n / 2)
      {
        space--;
        digits = digits + 2;
      }
      else
      {
        space++;
        digits = digits - 2;
      }
      System.out.println();
    }

  }
}
