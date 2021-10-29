import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    int row1 = scan.nextInt();
    int column1 = scan.nextInt();
    int Array1[][] = new int[row1][column1];
    for (int i = 0; i < row1; i++)
    {
      for (int j = 0; j < column1; j++)
      {
        Array1[i][j] = scan.nextInt();
      }
    }

    int row2 = scan.nextInt();
    int column2 = scan.nextInt();
    int Array2[][] = new int[row2][column2];
    for (int i = 0; i < row2; i++)
    {
      for (int j = 0; j < column2; j++)
      {
        Array2[i][j] = scan.nextInt();
      }
    }

    if (column1 == row2)
    {
      int Answer[][] = MatrixMultiplier(Array1, Array2);
      for (int i = 0; i < Answer.length; i++)
      {
        for (int j = 0; j < Answer[0].length; j++)
        {
          System.out.print(Answer[i][j] + " ");
        }
        System.out.println();
      }
    }
    else
    {
      System.out.println("Invalid input");
    }

  }

  public static int[][] MatrixMultiplier(int[][] Array1, int [][]Array2)
  {
    int row1 = Array1.length;
    int column1 = Array1[0].length;
    int row2 = Array2.length;
    int column2 = Array2[0].length;
    int Answer[][] = new int[row1][column2];
    for (int i = 0; i < row1; i++)
    {

      for (int j = 0; j < column2; j++)
      {
        int product = 0;
        for (int k = 0; k < row2; k++) //bcz row2==column1
        {
          product += Array1[i][k] * Array2[k][j];
        }
        Answer[i][j] = product;
      }
    }
    return Answer;
  }
}
