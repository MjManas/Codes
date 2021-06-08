import java.util.Arrays;
import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        int l;
        int ar[]=new int[5];
        int ar1[]=new int[5];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of 1st array");
        int x=s.nextInt();
        for ( int i = 0 ; i <x; i++)

        {

            ar[i]=s.nextInt();

        }
        l=max(ar,x);
        System.out.println(l);
    }

    private static int max(int[] ar, int x)
    {
        int j=0;
        for (int i = 0; i <x ; i++)
         {
          if(ar[i]>j)
              j=ar[i];

         }
         return j;
    }
}
