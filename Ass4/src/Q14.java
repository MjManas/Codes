import java.util.Arrays;
import java.util.Scanner;

public class Q14
{
    private static int[] sum(int[] ar, int[] ar1, int x, int y)
    {
         int ar2[]=new int[5];
        int i;
        int j;
         for (i = 0,j=0 ; i <x-1;j++, i++)
        {
            ar2[i]=ar[i]+ar1[i];

        }

        return ar2;
    }

    public static void main(String[] args)
    {
        int i;
        int j;
        int ar[]=new int[5];
        int ar1[]=new int[5];
        int ar2[]=new int[5];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of 1st array");
        int x=s.nextInt();
        System.out.println("ENter the size of scnd array");
        int y=s.nextInt();
        System.out.println("Enter first array");
        for (i = 0 ; i <x; i++)

        {

            ar[i]=s.nextInt();

        }
        System.out.println("ENter second array");
        for (j = 0 ; j <x; j++)
        {

            ar1[j]=s.nextInt();

        }
        ar2=sum(ar,ar1,x,y);
        System.out.println(Arrays.toString(ar2));
    }
}
