import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception     {
Scanner scan=new Scanner(System.in);
String ques=scan.nextLine();
printSS(ques,"");

    }

    public static void printSS(String str, String ans) 
    {
    if(str.length()==0)
    {
     System.out.println(ans); 
     return;
    } 
     
     char ch=str.charAt(0);
     String roq=str.substring(1);
     printSS(roq,ans+ch);
     printSS(roq,ans+"");
     
    }

}
