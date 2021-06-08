import java.util.Arrays;
import java.util.Scanner;

public class selectionsort
{
    public static void main(String[] args)
    {
       int start;
       int a;
       int ar[]= new int[5];
        Scanner s= new Scanner(System.in);
        for (int i = 0; i <ar.length ; i++)
        {
            ar[i]=s.nextInt();
        }
        Selection(ar);
    }
    public static void Selection(int ar[])
    {
        int i;
        int j;
        int n=0;
        for(j=ar.length-1;j>=0;j--)
        {
            for (i = 0; i <ar.length-1; i++)
            {
                if(ar[i]<ar[i+1])
                {
                    n=ar[i+1];
                }

            }
            ar[j]=n;
        }
        System.out.println(Arrays.toString(ar));
    }
}
