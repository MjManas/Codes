import java.util.Arrays;
import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        int m;
        int n;
        int ar[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter post. to be swapped");
        m=s.nextInt();
        n=s.nextInt();
        System.out.println("Enter the array");
        for (int i = 0; i <ar.length ; i++)
        {
          ar[i]=s.nextInt();
        }
        swap(ar,m,n);
        System.out.println(Arrays.toString(ar));
    }

    private static void swap(int[] ar, int m, int n)


    {

        for (int i = 0; i <ar.length ; i++)
        {
           int k =ar[m];
            ar[m]=ar[n];
            ar[n]=k;
        }
        for (int i = 0; i <ar.length ; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
