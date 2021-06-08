import java.util.Arrays;
import java.util.Scanner;

public class recbubble
{
    public static void main(String[] args)
    {
     int i=0 ,j=0;
     int ar[]=new int[5];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the array");
        for (i = 0; i <ar.length ; i++)
        {
            ar[i]=s.nextInt();
        }
        bubble(ar,0,j);
        System.out.println(Arrays.toString(ar));
    }

    private static void bubble(int[] ar, int i, int j)
    {
        if(i==ar.length-1)
          {
            return;
          }
        if(j==ar.length-i-1)
          {
              bubble(ar,i+1,0);
              return;
          }

        if(ar[j]>ar[j+1])
        {
            int k=ar[j];
            ar[j]=ar[j+1];
            ar[j+1]=k;

        }
        bubble(ar,i,j+1);

    }
}
