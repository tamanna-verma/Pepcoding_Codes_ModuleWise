import java.io.*;
import java.util.*;

public class Main
{

  public static void main(String[] args) throws Exception
  {
 Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int input[][] = new int[n][n];

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        input[i][j] = scan.nextInt();
      }
    }
    
   //yha hume diagonally traverse krna hai 
 //to jese row index wise 1 2 3 bdte hai aise hi diagonals bhi gapwise 0 1 2 3 bdte hai ,to diagonalgap k loop me sb rows aayegi , un sb rows me sb columns b aayege , jb b column no - row  no ka gap current diagonal gap k equal ho , tab us element ko print krdo , aise krte krte , vo element print hoge sbse phle jinka rowcol ka gap 0 hoga ,fir vo hoge jinka rowcol ka gap 1 hoga and so on jbtk row col ya diagonal gap n k equal na hojaye
    
    for(int diagonalgap=0;diagonalgap<n;diagonalgap++)
    {
     
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
           if((j-i)==diagonalgap)
           {
               System.out.println(input[i][j]);
           }
        }
    }
    }
  }

}
