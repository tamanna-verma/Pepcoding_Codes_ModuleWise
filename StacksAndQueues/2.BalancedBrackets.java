import java.util.*;
public class Main
{


public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    String str=scan.nextLine();
    Stack<Character>stack=new Stack<>();
    for(int i=0;i<str.length();i++)//string ki puri length pe travel krna hoga hume 
    {
        char ch=str.charAt(i);
       if(ch=='('||ch=='{'||ch=='[')
       {
        stack.push(str.charAt(i));
       }
       else if(ch==')'||ch=='}'||ch==']')
       {
        
         if(stack.isEmpty()==false&&ch==')')
         {
             if(stack.peek()!='(')
             {
                System.out.println(false);
                return;
             }
             else
                {
                    stack.pop();
                }
         }
         else if(stack.isEmpty()==false&&ch==']')
         {
             if(stack.peek()!='[')
             {
                System.out.println(false);
                return;
             }
             else
                {
                    stack.pop();
                }
         } else if(stack.isEmpty()==false&&ch=='}')
         {
             if(stack.peek()!='{')
             {
                System.out.println(false);
                return;
             }
             else
                {
                    stack.pop();
                }
         }
         else if(stack.isEmpty()==true)
         {
            System.out.println(false);
                return; 
         }
         

       }
    }
         if(stack.isEmpty()==false)
         {
            System.out.println(false);
                return; 
         }

System.out.println(true);
}

    
}
