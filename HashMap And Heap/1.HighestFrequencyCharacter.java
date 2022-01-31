import java.io.*;
import java.util.*;

public class Main {


 public static void HighestFrequencyCharacter(String str)
    {
        HashMap<Character,Integer> FreqMap=new HashMap<>();//humne character k liye ek frequency map bnaya 
        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            if(FreqMap.containsKey(str.charAt(i)))
            {
                int oldFreq=FreqMap.get(str.charAt(i));
                int newFreq=oldFreq+1;
                FreqMap.put(str.charAt(i),newFreq);
            }
            else
            {
                FreqMap.put(str.charAt(i),1);
            }

            }

            char maxFreqWalaCharacter=str.charAt(0);
            for(int i=0;i<str.length();i++)
            {
                if(FreqMap.get(str.charAt(i))>FreqMap.get(maxFreqWalaCharacter))
                {
                    maxFreqWalaCharacter=str.charAt(i);
                }
            }
            System.out.println(maxFreqWalaCharacter);
        }

    public static void main(String[] args) throws Exception {
 
   Scanner scan=new Scanner(System.in);
      String str=scan.nextLine();
      HighestFrequencyCharacter(str);

}

}
