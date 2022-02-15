import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a)
  {
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

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr)
 {
   int ans[]=new int[arr.length];
   ans[0]=1;

   Stack<Integer> stack=new Stack<>();
   stack.push(0);
   for(int i=1;i<=arr.length-1;i++)
   {
     while(stack.isEmpty()==false&&arr[stack.peek()]<arr[i])
     {
       stack.pop();
     }

     if(stack.isEmpty()==true)
     {
       ans[i]=i+1;
       stack.push(i);
     }
     else//agar greater element milgya hai 
     {

       int j =stack.peek();
       ans[i]=i-j;
       stack.push(i);
     }
   }
   return ans;
 }

}
