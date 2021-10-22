import java.util.*;

public class Main {

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int digits = 1;
    int space = (n * 2) - 3;
    for (int i = 1; i <= n; i++)
    {
      digits = i;
      for (int j = 1; j <= digits; j++)
      {
        System.out.print(j+"	");
      }
      for (int j = 1; j <= space; j++)
      {
        System.out.print("	");
      }
      if (i == n )
      {
        for (int j = digits-1; j >=1; j--)
        {
          System.out.print(j+"	");
        }
      }
      else
      {
        for (int j = digits; j >=1; j--)
        {
          System.out.print(j+"	");
        }
      }
      space -= 2;
     
      System.out.println();
    }
  }
}
