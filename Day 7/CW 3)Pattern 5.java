import java.util.*;

public class Main
{

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nsp = n / 2;
    int nst = 1;
    for (int i = 0; i <= n; i++)
    {
      for (int j = 0; j < nsp ; j++)
      {
        System.out.print("	");
      }
      for (int k = 0; k < nst ; k++)
      {
        System.out.print("*	");
      }
      if (i < n / 2)
      {
        nsp--;
        nst = nst + 2;
      } else
      {
        nsp++;
        nst = nst - 2;
      }
      System.out.println();
    }
  }
}
