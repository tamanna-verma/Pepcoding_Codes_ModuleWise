import java.util.*;
public class Stack1 
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
       Stack stack=new Stack<>();
       stack.push(10);
      System.out.println(stack.peek());//peek function value ko return krta hai aur remove function bas top se value ko remove krdeta hai , return nhi krta kuch
      stack.push(20);

      System.out.println(stack.peek());
      stack.push(30);
      stack.push(50);
      stack.push(60);
      while(stack.isEmpty()==false)
      {
         System.out.println(stack.peek());
          stack.pop();
      }
    }
}
