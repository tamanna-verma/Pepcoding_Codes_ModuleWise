import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        //humne chessboard ka sie input liya hai 
        int size=scan.nextInt();
        int row=scan.nextInt();
        int col=scan.nextInt();
        
        int chess[][]=new int[size][size];
        for(int i=0;i<size;i++)
        {
          for(int j=0;j<size;j++)
          {
              chess[i][j]=0;
          }
        }
        
        printKnightsTour(chess,row,col,1);
        
    }

    public static void printKnightsTour(int[][] chess, int row, int col, int upcomingMove) 
    {
    //hume 2 base case chahiye honge 
    // ek hoga negative base case
    {
    if(row<0||row>=chess.length||col<0||col>=chess.length||chess[row][col]!=0)
    {
        return ;
    }
    
    //ek hoga negative base case
    else if(upcomingMove==chess.length*chess.length)
    {
        chess[row][col]=chess.length*chess.length;
        displayBoard(chess);
        chess[row][col]=0;
        return;
    }
    //chess me value update krdo to upcomingMove
    chess[row][col]=upcomingMove;
    
    //ab hume 8 moves k liye recursive calls lgani hogi 
    printKnightsTour(chess,row-2,col+1,upcomingMove+1);
    printKnightsTour(chess,row-1,col+2,upcomingMove+1);
    printKnightsTour(chess,row+1,col+2,upcomingMove+1);
    printKnightsTour(chess,row+2,col+1,upcomingMove+1);
    printKnightsTour(chess,row+2,col-1,upcomingMove+1);
    printKnightsTour(chess,row+1,col-2,upcomingMove+1);
    printKnightsTour(chess,row-1,col-2,upcomingMove+1);
    printKnightsTour(chess,row-2,col-1,upcomingMove+1);
    
    //chess me vapas se phle vali value daldo
    chess[row][col]=0;
    }
    
        
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
