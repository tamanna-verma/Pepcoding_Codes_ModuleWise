import java.io.*;
import java.util.*;

public class Main
{

  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    ArrayList<String> ans = getKPC(str);
    System.out.println(ans);
  }

  static String codes[]  = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
  public static ArrayList<String> getKPC(String str)
  {
    if (str.length() == 0)
    {
      ArrayList<String> baseAns = new ArrayList<String>();
      baseAns.add("");
      return baseAns;
    }
    char ch = str.charAt(0);

    ArrayList<String> restans = getKPC(str.substring(1));

    ArrayList<String> FinalAns = new ArrayList<String>();
    String startingCharacterKeCodes = codes[str.charAt(0) - 48];

    for (int j = 0; j < startingCharacterKeCodes.length(); j++)
    {
      for (String smallanskistring : restans)
      {
        char character = startingCharacterKeCodes.charAt(j);
        FinalAns.add(character + smallanskistring);
      }

    }
    return FinalAns;
  }

}
