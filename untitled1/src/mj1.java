import java.util.Scanner;

import static java.lang.Math.pow;

public class mj1
{
 public static void main(String[] args)
 {
     int n;
     System.out.println("ENter a no.");
     Scanner s= new Scanner(System.in);
     n=s.nextInt();
     inverse(n);

 }

    private static void inverse(int n)
    {
       double x=0;
        int v=0;
       int p=0;
       int b=n;
       while(n>0)
       {
        v = n % 10;
        n = n / 10;
        p++;
        x = x + p * pow(10, v - 1);
       }
     if(x==b)
     {
         System.out.println("MIRROR INVERSE!");
     }
     else
     {
         System.out.println("NOT MIRROR INVEERSE!");
     }
    }


}
