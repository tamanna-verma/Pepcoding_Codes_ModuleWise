import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) throws Exception 
    {

      Scanner scan=new Scanner(System.in);
        String str =scan.nextLine();
        Stack<Character> stack=new Stack<>();


        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=')')
            {
             stack.push(str.charAt(i));
            }
            else
            {
               if(stack.peek()=='(')
            {
               System.out.println(true);
               return;//return se to main function se hi bhr aajayege 
            }  
            else
            {
                while(stack.peek()!='(')
                {
                    stack.pop();
                }
                stack.pop();
            }

            }
        }
        System.out.println(false);

    }

}
