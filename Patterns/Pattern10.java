import java.util.*;

public class Main {

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int StartGap = n / 2;
    int MiddleGap =0;

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < StartGap; j++)
      {
        System.out.print("	");
      }
      System.out.print("*");
      for (int j = 0; j < MiddleGap; j++)
      {
        System.out.print("	");
      }

      if (i < n / 2)
      {
        StartGap -= 1;
        MiddleGap += 2;
      }
      else
      {
        StartGap += 1;
        MiddleGap -= 2;
      }
     
     if(i==0||i==n-1)
      {
        System.out.println();
      }
      else{
        System.out.println("*");  
      }
    }
  }

}
