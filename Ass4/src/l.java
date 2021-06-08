import java.util.Scanner;

public class l
{
    private static int[] sum(int[] ar, int[] ar1, int x, int y)
    {
        int ar2[]=new int[5];
        int i=0;
        int j=0;
        while(i < x-1)
        {
            ar2[i]=ar[i]+ar1[i];
            j++;
            i++;
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

        int x=s.nextInt();

        for (i = 0 ; i <x; i++)

        {

            ar[i]=s.nextInt();

        }
        int y=s.nextInt();

        for (j = 0 ; j <y; j++)
        {

            ar1[j]=s.nextInt();

        }
        ar2=sum(ar,ar1,x,y);
        if(x>y)
        {
            for(i=0;i<x;i++)
            {
                System.out.print(ar2[i] + ", ");
            }
        }
        else if(y>x)
        {
            for(j=0;j<y;j++)
            {
                System.out.print(ar2[j] + ", ");
            }
        }

    }
}
