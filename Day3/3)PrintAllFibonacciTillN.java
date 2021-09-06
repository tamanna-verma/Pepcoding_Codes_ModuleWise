import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = 0;
    int b = 1;
    int t=1;
    while (t <= n)
    {
      int c = a + b;
      System.out.println(a);
      a = b;
      b = c;
      t++;
    }
  }
}
