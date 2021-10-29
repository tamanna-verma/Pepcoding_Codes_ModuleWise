import java.io.*;
import java.util.*;

public class Main 
{

  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int column = scan.nextInt();

    int input[][] = new int[row][column];

    for (int i = 0; i < input.length; i++)
    {
      for (int j = 0; j < input[0].length; j++)
      {
        input[i][j] = scan.nextInt();
      }
    }

    for (int j = 0; j < column; j++)
    {
      if (j % 2 == 0)
      {

        for (int i = 0; i < row; i++)
        {
          System.out.println(input[i][j]);
        }

      }
      else if (j % 2 != 0)
      {
        for (int i = row-1; i >= 0; i--)
        {
          System.out.println(input[i][j]);
        }
      }
    }
  }} 
