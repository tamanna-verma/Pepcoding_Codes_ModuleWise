import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception     {
     Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int m =scan.nextInt();
    int Array[][]=new int[n][m];
    //humne 2 d array input liya hai.hume 2 d array ki s number vali shell ko r se rotate krna hai ,sbse bahar vale shell ka shell number 1 hota hai , uskee andar vali shell ka shell no. 2 hota h , uske andar vali shhell ka shell number 3 hota hai and so on..., ab hume ye to pta hi hai ki 1 d array ko kese rotate krte hai to hum ab phle 2 d array ki sth shell ko 1 d array me convert krege aur fir us 1  d array ko rotate krege aur fir hum us rotated 1 d array ko 2 d array k sth shell me fill krdege  taki 2 d array ka sth shell rotate hojaye finally 
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
                Array[i][j]=scan.nextInt();
        }
    }
    //fir humne shell no. input liya hai
    //fir humne r input liya hai taki ye pta chljaye ki kitne se rotate krni hai shell
    int s=scan.nextInt();
    int r=scan.nextInt();
    
    rotateShell(Array,s,r);//Array pass kiya , shell no.pass kiya aur r rotate krne k liye pass kiya 
    display(Array);
    
    }
    public static void rotateShell(int [][] Array,int s ,int r)
    {
        //hum ab phle ek one array bnayege aur use sth shell se fill krege
        
        int []OneD=FillOneDFromShell(Array,s);
//fir hum use 1 d array ko rotate krege 

        int[] rotatedOneD=rotateOneD(OneD,r);
//fir hum us rotated 1 d array se shell ko fill krdege vapas se

       FillShellFrom1D(Array,rotatedOneD,s);
    }
    public static int[] rotateOneD(int[]OneD,int r)
    {
      //  ab 1 d array rotate kese krte the suppose 1 2 3 4 5 ek array hai humare pas ,hume use 3 se rotate krna hai mtlb use 3 4 5 1 2 bnana hai to hum ab 1 2 ko alag krlo aur 3 4 5 ko alag aur ab 1 2 ko reverse krdo aur 3 4 5 ko reverse krdo aur ab 2 1 5 4 3 ko pura reverse krdo pure array ko to bnega 3 4 5 1 2 , and hume yhi chahiye tha so that is the trick to rotate one d array ,hume ye krne k liye ye point chahiye jhase aage vala array hai start to end (n-r size ka )aur last vala array to r size ka hoga 
      
      r=r%(OneD.length);
      if(r<0)
      {
      r=r+OneD.length;
      }
      
      reverse(OneD,0,OneD.length-r-1);//starting vala array ka part reverse krne k liye ye kro
      
      reverse(OneD,OneD.length-r,OneD.length-1);//second vala array ka part reverse krne k liye ye kro
      
      reverse(OneD,0,OneD.length-1);//pura array ko reverse krne k liye ye kro
  //    for(int i=0;i<OneD.length;i++)
//{
 //  System.out.println(OneD[i]);
//}
   return OneD; }

public static void reverse(int []oned,int li,int ri)
{
while(li<ri)
{
    int temp=oned[li];
    oned[li]=oned[ri];
    oned[ri]=temp;
    li++;
    ri--;
    
}
}
public static void FillShellFrom1D(int Array[][],int oned[],int s)
{
   int minr=s-1;
     int minc=s-1;
     int maxr=Array.length-s;
     int maxc=Array[0].length-s;

     int idx=0;
     for(int i=minr;i<=maxr;i++)
     {
        Array[i][minc]=oned[idx];
        idx++;
     }
     minc++;
     // to traverse on the bottom wall
     for(int i=minc;i<=maxc;i++)
     {
        Array[maxr][i]=oned[idx];
        idx++;
     }
     maxr--;
     // to traverse on the right wall
     for(int i=maxr;i>=minr;i--)
     {
        Array[i][maxc]=oned[idx];
        idx++;
     }
     maxc--;
     
     // to traverse on the top wall
    for(int i=maxc;i>=minc;i--)
     {
        Array[minr][i]=oned[idx];
        idx++;
     }
     
}
public static int[] FillOneDFromShell(int[][]Array,int s)
{
    //shell 1 --> top left corner -->0 ,0 
             // -->bottom right corner -->array.length-1,array[0].length-1
        //shell 2 --> top left corner -->1 ,1 
             // -->bottom right corner -->array.length-2,array[0].length-2
    
    //shell n --> top left corner -->shell-1,shell-1
            //--> bottom right corner -->array.length-shell, array[0].length-1
  
  //shell ka size =(left wall+bottom wall+ right wall + top wall)-4(to remove corners to come twice )==2*leftwall+2* bottom wall
  
  
     int minr=s-1;
     int minc=s-1;
     int maxr=Array.length-s;
     int maxc=Array[0].length-s;
     int size= 2*(maxr-minr+maxc-minc);

     int oned[]=new int[size];
     
     // to traverse on the left wall
     int idx=0;
     for(int i=minr;i<=maxr;i++)
     {
        oned[idx]=Array[i][minc];
        idx++;
     }
     minc++;
     
     // to traverse on the bottom wall
     for(int i=minc;i<=maxc;i++)
     {
        oned[idx]=Array[maxr][i];
        idx++;
     }
     maxr--;
     
     // to traverse on the right wall
     for(int i=maxr;i>=minr;i--)
     {
        oned[idx]=Array[i][maxc];
        idx++;
     }
     maxc--;
     
     // to traverse on the top wall
    for(int i=maxc;i>=minc;i--)
     {
        oned[idx]=Array[minr][i];
        idx++;
     }
     minr++;
     
     return oned;
            
}

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
