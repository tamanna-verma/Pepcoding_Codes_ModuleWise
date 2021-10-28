import java.io.*;
import java.util.*;

public class Main
{

  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int column = scan.nextInt();

    ArrayList<String>ans = getMazePaths(1, 1, row, column);
    System.out.println(ans);
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
  { if (sr > dr || sc > dc)
    {
      ArrayList<String> baseresult = new ArrayList<String>();
      return baseresult;
    }

    { if (sr == dr && sc == dc)
      {
        ArrayList<String> baseresult = new ArrayList<String>();
        baseresult.add("");
        return baseresult;
      }
      ArrayList<String> mypaths = new ArrayList<String>();

      ArrayList<String> myhpaths = getMazePaths(sr, sc + 1, dr, dc);
      ArrayList<String> myvpaths = getMazePaths(sr + 1, sc, dr, dc);

      for (String myhpath : myhpaths)
      {
        mypaths.add("h" + myhpath);
      }
      for (String myvpath : myvpaths)
      {
        mypaths.add("v" + myvpath);
      }
      return mypaths;
    }

  }
  }
