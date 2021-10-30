import java.io.*;
import java.util.*;

public class Main
{

  public static void main(String[] args) throws Exception     {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int Array[][] = new int[n][n];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        Array[i][j] = scan.nextInt();
      }
    }
    //ye array to sorted hai , to hume searching start krege from top right corner and we will search it ,agar number to be searched(x) current position se bda ho to go downwards mtlb i bdega agar number chota hoga to j km hoga mtlb j--
    int x = scan.nextInt();
    int i = 0;
    int j = n - 1;
    while (i < n && j >= 0)
    {
      if (Array[i][j] == x)
      {
        System.out.println(i);
        System.out.println(j);
        return;
      }
      else if (Array[i][j] < x)
      {
        i++;
      } else
      {
        j-- ;
      }
    }
    System.out.println("Not Found");
  }

}
