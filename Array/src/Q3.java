import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Q3
{
    public static void main(String[] args)
    {
        int ar[]=new int[5];
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the array");
        for (int i = 0; i <ar.length ; i++)
        {
            ar[i]=s.nextInt();
        }
        add(ar);
        reverse(ar);

    }

    private static void add(int[] ar)
    {
        for (int i = 0; i <ar.length ; i++)
        {
            ar[i]=ar[i]+2;
        }
        for (int i = 0; i <ar.length ; i++)
        {
            System.out.println(ar[i]);
        }
    }
    private static void reverse(int[] ar)
    {

        int i;
        int j;
        int m=((ar.length-1)/2);
        for (i = 0,j=ar.length-1; i <m ; i++,j--)
        {
            int k=ar[i];
            ar[i]=ar[j];
            ar[j]=k;

        }
        System.out.println(Arrays.toString(ar));
    }

}

