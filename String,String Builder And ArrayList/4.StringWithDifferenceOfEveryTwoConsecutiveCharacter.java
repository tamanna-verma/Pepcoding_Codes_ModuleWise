import java.io.*;
import java.util.*;

public class Main {

  public static String solution(String str)
  {
    StringBuilder sb = new StringBuilder(); //phle string builder blank hai usme first character of string dalo jo ki 0thindex pe hai
    sb.append(str.charAt(0));
    for (int i = 1; i < str.length(); i++)
    {
      char curr = str.charAt(i); //jo ith index pe element hai
      char prev = str.charAt(i - 1); //jo i-1th index pe element hai

      int gap = curr - prev; // un dono k beech me gap kitna hai
      sb.append(gap);//answer string builder me gap append krdo aur fir usme current index pe jo bhi element hoga vo add krte chalo
      sb.append(curr);
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }

}
