import java.util.Arrays;
import java.util.Scanner;

public class mergesort
{
    public static void main(String[] args)
    {
        int ar[] = new int[5];
        int M[] = new int[5];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i<n;i++)
        {
            ar[i] = s.nextInt();
        }
        M=msort(ar);
        for(int i = 0; i<n;i++)
        {
            System.out.print(M[i] + " ");
        }

    }
    public static int[] msort(int ar[])
    {
        if(ar.length==1)
        {
            return ar;
        }
        int m=ar.length/2;
        int first[]=msort(Arrays.copyOfRange(ar,0,m));
        int second[]=msort(Arrays.copyOfRange(ar,m,ar.length));
        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second)
    {
        int mix[]=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k]=first[i];
                i++;
                k++;
            }
            else
            {
                mix[k]=second[j];
                j++;
                k++;

            }
        }
        while(i<first.length)
        {
                mix[k] = first[i];
                i++;
                k++;
            }
        while(j<second.length)
            {
                mix[k]=second[j];
                j++;
                k++;

            }

      return mix;
    }
}
