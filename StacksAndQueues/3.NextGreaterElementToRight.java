import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr)
 {
   int ans[]=new int [arr.length];
   Stack<Integer> stack=new Stack<>();

   ans[arr.length-1]=-1;
   stack.push(arr[arr.length-1]);

   for(int i=arr.length-2;i>=0;i--)
   {
     while(stack.isEmpty()==false&&stack.peek()<arr[i])
     {
       stack.pop();
     }
     if(stack.isEmpty()==true)
     {
       ans[i]=-1;
     }
     else
     {
        ans[i]=stack.peek();
     }

     stack.push(arr[i]);
   }

   return ans;
 }

}
