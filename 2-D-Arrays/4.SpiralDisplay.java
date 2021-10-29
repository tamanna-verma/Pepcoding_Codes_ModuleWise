import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception    {

    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int column = scan.nextInt();
    int Array[][] = new int[row][column];
    for (int i = 0; i < Array.length; i++)
    {
      for (int j = 0; j < Array[0].length; j++)
      {
        Array[i][j] = scan.nextInt();
      }
    }

    SpiralDisplay(Array);
  }

  public static void SpiralDisplay(int[][]Array)
  {
    int rs = 0;
    int cs = 0;
    int re = Array.length-1;
    int ce = Array[0].length-1;
    int tne=(Array.length)*(Array[0].length);
    int count=0;
//loop kbtk chlega , jbtk total no of digits printed , total no. of elements jitne nhi hojate
    while (count<tne)
    {
      if(count<tne)
      {
      for (int i = rs; i <= re; i++)
      {
        System.out.println(Array[i][cs]);
        count=count+1;
      }
      }
      cs++;
      if(count<tne)
      {
      for (int i = cs; i <= ce; i++)
      {
        System.out.println(Array[re][i]);
        count=count+1;
      }
      }
      re--;
      if(count<tne)
      {
      for (int i = re; i >= rs; i--)
      {
        System.out.println(Array[i][ce]);
        count=count+1;
      }
      }
      ce--;
      if(count<tne)
      {
      for (int i = ce; i >= cs; i--)
      {
        System.out.println(Array[rs][i]);
        count=count+1;
      }
      }
      rs++;
    }
  }

}
