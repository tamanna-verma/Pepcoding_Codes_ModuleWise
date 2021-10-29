import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int Array[][] = new int[n][n];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        Array[i][j] = scan.nextInt();
      }
    }

    //hume ek 2 d array mila hai ,
//hume use rotate krna hai 90 dgree clockwise
// 2 d array ko anticlockwise b rotate krskte hai aur clockwise bhi
//clockwise rotate krne k liye hum phle anticlockwise rotation krege aur usiki help se fir hum clockwise rotate krege
// anticlockwise rotation ko transpose bhi bolte hai
// to fir agar hume transpose krna hai ya agar hume anticlockwise rotation krni hi to hum array[i][j]
//ko array[j][i] bnayege aur aisa hum sif aur sirf array k upper ya lower triangle kisi ek triangle me krskte hai taki ek point ka element 2 bar change hoke vapas se phle vala element/value bnjayega
//to ab hume transpose krne k bad , hume ab us transposed matrix ya array se sare columns ko reverse krna hai mtlb first column kon last , aur last column ko first , and so on taki humara anticlockwise rotated matrix ab clockwise rotate hopaye

    for (int i = 0; i < Array.length; i++)
    {
      for (int j = 0; j <=i; j++) //hum sirf upper left triangle k element ko swap krrhe hai taki ek position ka element 2 bar swap na hojaye
      {
        int temp = Array[i][j];
        Array[i][j] = Array[j][i];
        Array[j][i] = temp;
      }
    }
    //to humne transposed array to bnaliya ab hume is transposed array k sare columns ko reverse krna hoga taki ye transpose ya anticlockwise rotated array clockwise array bnpaye

    for (int i = 0; i < Array.length; i++)
    {
    int sc = 0; //starting column
    int ec = Array[0].length - 1; //endcolumn

      while (sc < ec)
      {
        { int temp = Array[i][sc];
          Array[i][sc] = Array[i][ec];
          Array[i][ec]=temp;
          sc++;
          ec--;
        }

      }
    }
    display(Array);
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
