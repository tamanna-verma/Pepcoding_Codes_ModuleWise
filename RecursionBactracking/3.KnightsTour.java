import java.io.*;
import java.util.*;

public class Main
{

  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int chess[][] = new int[n][n]; //chess ka board bnaliya usme har jgh 0 hai
    printNQueens(chess,"",0);
  }

  public static void printNQueens(int[][] chess, String qsf, int row)
  {
    if (row == chess.length)
    {

      System.out.println(qsf + ".");
      return;
    }

    for (int col = 0; col < chess.length; col++)
    {
      if (IsThisCellSafeForQueen(chess, row, col) == true)
      {
        chess[row][col] = 1;
        printNQueens(chess, qsf+row + "-" + col + ", ", row + 1);
        chess[row][col] = 0;
      }
    }



  }
  public static boolean IsThisCellSafeForQueen(int chess[][], int row, int col)
  {
    for (int i = row - 1,j=col; i >= 0; i--)
    {
      if (chess[i][j] > 0)
      {
        return false;
      }
    }
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
    {
      if (chess[i][j] > 0)
      {
        return false;
      }
    }
    for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++)
    {
      if (chess[i][j] > 0)
      {
        return false;
      }
    }
    return true;
  }
}
