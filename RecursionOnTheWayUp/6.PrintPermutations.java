import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args) throws Exception     {
     Scanner scan=new Scanner(System.in);
     String str=scan.next();
     printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf)
    {
     if(str.length()==0)
     {
         System.out.println(asf);
         return;
     }
     for(int i=0;i<str.length();i++)//to get the character which will be concatinated in the answer
     {
     printPermutations((str.substring(0,i)).concat(str.substring(i+1,str.length())),asf+str.charAt(i));//0 se i tak substring li kyuki substring soes include the last index aur yha concat function use kiya                    //// str1.concat(str2)////
     
     
     } 
    }

}
