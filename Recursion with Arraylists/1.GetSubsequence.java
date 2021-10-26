import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception     {
     
     Scanner scan=new Scanner(System.in);
     String str=scan.nextLine();
     ArrayList<String> ans =gss(str);
     System.out.println(ans);
    }

    public static ArrayList<String> gss(String str)
    {
     if(str.length()==0)
     {
         ArrayList<String> base_case_ans=new ArrayList<>();
         base_case_ans.add("");
         return base_case_ans;
     }
     char ch=str.charAt(0);
     ArrayList<String> smallans=gss(str.substring(1));
     ArrayList<String> myans=new ArrayList<>();
     for(String i:smallans)
     {
        myans.add(i);
     }
     for(String i:smallans)
     {
        myans.add(ch+i);
     }
     return myans;
    }

}
