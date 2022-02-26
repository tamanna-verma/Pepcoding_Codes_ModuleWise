import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception 
{
  Scanner scan=new Scanner(System.in);//siddhi verma3A
  int n=scan.nextInt();
  int qb[]=new int[n+1];//question bank
  int ans=FibonacciDP(n,qb);
  System.out.println(ans);
}

public static int FibonacciDP(int n, int qb[])
{
  if(n==0||n==1)
  {
    return n;
  }
  if(qb[n]!=0)
  {
    return qb[n];

  }
  
  int fibnm1=FibonacciDP(n-1,qb);
  int fibnm2=FibonacciDP(n-2,qb);
  int fibn=fibnm1+fibnm2;

  qb[n]=fibn;
  return fibn;

}
}
