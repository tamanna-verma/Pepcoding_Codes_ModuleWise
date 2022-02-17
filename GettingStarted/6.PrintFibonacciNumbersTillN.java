import java.util.*;
  
  public class Main
  {
  
  public static void main(String[] args)
   {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int prev=0;
      int next=1;

      int count=0;
      while(count<n)
      {
        System.out.println(prev);
        int temp=next;
        next=prev+next;
        prev=temp;
        count++;
       

      }
   }
  }
