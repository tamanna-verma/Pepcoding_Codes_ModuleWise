import java.util.*;
  
  public class Main
  {
  
  public static void main(String[] args)
   {
     Scanner scan=new Scanner(System.in);
     int a=scan.nextInt();
     int b=scan.nextInt();
     int c=scan.nextInt();

     //ab hume ye  ye check krna hoga ki in sb me se sbse bda konsa hai 
     if(a>b&&a>c)
     {
      if((a*a)==(b*b)+(c*c))
      {
        System.out.println(true);
      }
      else
      {
        System.out.println(false);

      }
     }
     else if(b>a&&b>c)
     {
       if((b*b)==(a*a)+(c*c))
      {
        System.out.println(true);
      }
      else
      {
        System.out.println(false);
        
      }
     }
     else if(c>a&&c>b)
     {
       if((c*c)==(b*b)+(a*a))
      {
        System.out.println(true);
      }
      else
      {
        System.out.println(false);
        
      }
     }
    
   }
  }
