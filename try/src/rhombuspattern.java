import java.util.Scanner;

public class rhombuspattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
     int n= s.nextInt();
     int p=n-1;
     for (int i = 1; i <= n ; i++)
        {
         for (int k=p;k>=1;k--)
         {
             System.out.print(" ");
         }
         p--;
         if (i==1 || i==n)
         {
             for (int j = 1; j <= n ; j++)
             {
                 System.out.print("*");
             }
         }
         if (i>1 && i<n)
         {

                 System.out.print("*" + "   " + "*");


         }
            System.out.println();
        }
    }
}
