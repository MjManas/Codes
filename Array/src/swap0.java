import java.util.Arrays;
import java.util.Scanner;

public class swap0
{
    public static void main(String[] args)
    {

        int ar[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=s.nextInt();
        System.out.println("Enter the array");
        for (int i = 0; i <n ; i++)
        {
            ar[i]=s.nextInt();
        }
        swap(ar,n);
    }

    private static void swap(int[] ar, int n)
    {
        int k;
        for (int i = 0; i <n-1 ; i++)
        {
            for (int j = 0; j <n-i-1 ; j++)
            {
                if(ar[j]==0)
                {
                    k = ar[j + 1];

                    ar[j + 1] = ar[j];
                    ar[j] = k;
                }

            }
        }

            System.out.println(Arrays.toString(ar));

    }
}
