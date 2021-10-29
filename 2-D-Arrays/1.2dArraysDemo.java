import java.io.*;
import java.util.*;

public class Main
{

  public static void main(String[] args) throws Exception
  {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=scan.nextInt();
int Array[][]=new int[n][m];
for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
       Array[i][j]=scan.nextInt(); 
    }
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
      System.out.print(Array[i][j]+" "); 
    }
    System.out.println();
}
  }

}
