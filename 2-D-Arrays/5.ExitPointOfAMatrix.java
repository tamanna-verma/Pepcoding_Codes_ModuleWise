import java.io.*;
import java.util.*;

public class Main
{

  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int dir = 0;
    int i=0;
    int j=0;
    int Array[][] = new int[n][m];
    for (int k = 0; k < n; k++)
    {
      for (int l = 0;l  < m; l++)
      {
        Array[k][l] = scan.nextInt();
      }
    }

    while (true) //ye loop chlte jane k liye hai
    {
      dir = (dir +Array[i][j]) % 4; //agar 0 hoga to 0 add hojayega otherwise 1 add hoga agr 1 mila to , 0 aane par same hi rhegi direction otherwise 1 bdjayegi
      if (dir == 0) //mtlb agar direction east hai
      {
        j++;
        if (j >= Array[0].length)
        {
          j--;
          break;
        }
      }
      else if (dir == 1) //mtlb agar ab new direction direction south hai to  ya fir phle b south thi aur abibi south hai to
      {
        i++;
        if (i >= Array.length)
        {
          i--;
          break;

        }
      }
        else if (dir == 2) //mtlb agar west direction me jana hai to
        {
          j--;
          if (j < 0)
          {
            j++;
            break;

          }
        }
          else if (dir == 3) //mtlb agar north direction me jana hai to
          {
            i--;
            if (i < 0)
            {
              i++;
              break;

            }
          }
       }
       System.out.println(i);
       System.out.println(j);
  }
    
}
