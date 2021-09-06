import java.util.*;
 public class Main
 {
  public static void main(String[] args)
  {
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int count=0;
   while(n!=0)
   {
       n=n/10;
       count=count+1;
   }
   System.out.println(count);
  }
}
