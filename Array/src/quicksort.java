import java.util.Arrays;
import java.util.Scanner;

public class quicksort
{
    public static void main(String[] args)
    {
        int ar[]= new int[5];
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        for (int i = 0; i <n ; i++)
        {
            ar[i]=s.nextInt();
        }
     quick(ar,0,n);
        for (int i = 0; i <n ; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
    public static void quick(int ar[],int start , int end)
    {
        if(end<=start)
        {
            return;
        }
        int pivot=end-1;
        pivot=pivotadjust(ar,start,pivot);
        quick(ar,start,pivot);
        quick(ar,pivot+1,end);
    }

    private static int pivotadjust(int[] ar, int start, int pivot)
    {
        int i;
        int j=start;
        for (i = start; i <pivot ; i++)
        {
          if(ar[i]<ar[pivot])
          {
           int t=ar[i];
           ar[i]=ar[j];
           ar[j]=t;
           j++;
          }
        }
        int t=ar[j];
        ar[j]=ar[pivot];
        ar[pivot]=t;
        return j;
    }

}
