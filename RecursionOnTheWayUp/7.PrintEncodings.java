import java.io.*;
import java.util.*;

public class Main
{

  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    printEncodings(str, "");


  }
  public static void printEncodings(String str, String asf)
  {
    //agar string ki length 0 hochuki hai then we just need to print the answer so far and return

    if (str.length() == 0)
    {
      System.out.println(asf);
      return;
    }
//else if the length of string is 1 which directly means that the string str has only 1 character and
//if that character is '0', then we just need to print the answer so far and return

    else if (str.length() == 1)
//humne is length 1 vale case ko alagse handle isliye kiya hai taki hum is character ko handle krne k bad koi b recursive calls na lgaye vrna out of index error aaskta hai
    {
      if (str.charAt(0) == '0')
      {
        return;
      }
      else
      {
//else agar vo character 0 nhi hai , then we just need to ass the encode corresponding to that character and print the answer so far and return

// agar hume character ka corresponding encode asf me add krna hai to hume krna hoga?

//hume ye to pta hai ki 'a'+2 krege to = hume milega 47+2=49 ascii code vala character that is c
//instead hume 2nd alphabet chahiye to hume 1 minus krna hoga taki hume 3rd alphabet nhi 2nd alphabet mile
//agar hume 5 mila hai string me character to hume 'a'+5 that is 'e' nhi chahiye , hume 'a'+5 -1 that is 'd' chahiye //so this is importance of subtracting 1

        char ch = str.charAt(0);
//hume 0th position par character leliya hai mtlb '1' .. '2' ..3..4..5..6..7..8..'9'..jo bhi hai vo character liya

        int chv = ch - '0';
//humne vo character ('1'-'10') jo bhi mila usko integer me convert kiya humne
//fir hume uske corresponding jo bhi hume value milegi like 1 k corresponding to hume 'a' chahiye,2 k corresponding hume 'b' chahiye to hume 'a'+2 -1 krna pdega , aur fir hume is alphabet ko add krna padega in the answer so far

        char encode = (char)('a' + chv - 1);
//characters ko jab bhi hum kbi b integers me add krte hai ya subtract krte hai to vo integer bnjate hai ,to hume vapas se character bnane k liye type cast krna pdta hai

      
        System.out.println(asf+encode);
        return;
      }
    }
    else if (str.length() > 1)
    {
//agar string ki length 1 se bdi hai to hume
// 1)first 1 charcter ko encode krna hai aur rest of the string ko recursively encode krna hai
//printEncoding functions me hume rest of the string pass krni hai aur asf me 1st character ka encode add krke pass krna hai

      char ch = str.charAt(0);
      String roq = str.substring(1);
      if (ch == '0')
      {
       
        return;
      }
      else
      {
        char ch1 = str.charAt(0);
        int ch1v = ch1 - '0';//char ko int me convert kiya
        char encode = (char)('a' + ch1v - 1);
       // String ASFAfterAddingFirstCharacter=asf + encode;
        printEncodings(roq,asf+encode); //ASFAfterAddingFirstCharacter);
       }


// 2)first 2 character ko encode krna hai aur rest of the string ko recursiely encode krna hai

//printEncoding functions me hume rest of the string pass krni hai aur asf me first two character ka encode add krke pass krna hai

if(str.charAt(0)!='0')
{
        
String first2Ch = str.substring(0, 2);
//hume string k phle 2 characters milgye hai
        
String roq12 = str.substring(2);
//hume baki ki string milgyi hai


int ch12v = Integer.parseInt(first2Ch);
//hume first 2 characters ko integer bnadiya ab hume unke correspnding jo bhi alphabet value hogi , usko asf me add krna hai
    if (ch12v <= 26)
    {
    char encodedFirst2 = (char)('a' + ch12v -1);
   // String  ASFAfterAddingFirstTwoCharacter=asf+encodedFirst2;
    printEncodings(roq12,asf+encodedFirst2);//ASFAfterAddingFirstTwoCharacter
         
    }
}    
    }
  }
}
