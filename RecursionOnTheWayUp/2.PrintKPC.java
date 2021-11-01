import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);
    String str = scan.next();

//humne string input li eg 658

    printKPC(str, "");

// 658,"" humne 658 ko as ques pass krdiya aur  "" ko as answer
  }

  public static String[]codes = {".;", "abc", "def", "ghi",
                                 "jkl", "mno", "pqrs", "tu","vwx", "yz"};

//ye humne codes likhe hai , jo ki har digit k corresponding likhe hue hote hai

  public static void printKPC(String str, String ans)
  {
    if (str.length() == 0)
//agar 658 ki length hi 0 hochuki hai then we just need to print the answer
    {
      System.out.println(ans);
      return;
    }

    char ch = str.charAt(0);
    //"6" ko ch me store kiya
    String roq = str.substring(1);
    //"58" ko roq me stor kiya

    String CodeForCh = codes[ch - '0'];

//"6" abibi ch me ek character ki form me stored hai , we need to have an integer at codes[6] here , so we need to subtract "0" from it , because ascii of "6" is 54 and ascii of "0" is 48 and 54 - 48 is 6, so now we have codes[6] , so we got the string which was at 6th index in codes array , therefore, we got "pqrs"

    for (int i = 0; i < CodeForCh.length(); i++)
    {

//so now , we have put a loop for characters of the string CodeForCh "pqrs" and now , we will be adding p infront of the answers we will be getting recursively from printKPC(roq), so in the answer , we have already done added the characters p q r s by adding this loop so these characters will be added in the answers of recursive call of print KPC(roq,ans)

      char option = CodeForCh.charAt(i);
      printKPC(roq, ans + option);
    }

  }

}
