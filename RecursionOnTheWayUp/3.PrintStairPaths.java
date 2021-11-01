import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
printStairPaths(n,"");

}

public static void printStairPaths(int n, String path) 
{
    //there will be 2 base case in this ques , one will be tht if the value of n is less than 0 and another will be uf the value of n is 0 , if the value of n is 0 then we just need to print the path we have till now and then return but if the value of n is less than 0 then in that case , we need to simply return 
    if(n<0)
    {
        return;
    }
   if(n==0)
  {
      System.out.println(path);
      return;
  }
 
 //hum ek time par 1 ya 2 ya 3 steps hi leskte hai , we need to print all the paths taking all the steps(1/2/3)
// so there will be 3 base case , 1 will be that we have taken 1 step ,
  printStairPaths(n-1,path+1);
 
//next recursive call will be for the case we take 2 steps 
  printStairPaths(n-2,path+2);
  
//next recursive call will be there for the case when we take 3 steps
  printStairPaths(n-3,path+3);
   
}

}
