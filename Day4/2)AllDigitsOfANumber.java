import java.util.*;

public class Main
{
  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int temp = n;
    int div = 1;
    while (temp >10)
    {
      div = div * 10;
      temp = temp / 10;
    }
    while (div >= 1)
    {
      int quotient = n / div;
      n = n % div;
      div = div / 10;
      System.out.println(quotient);
    }
  }
}
