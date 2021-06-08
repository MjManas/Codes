import java.util.Scanner;

public class isarraysorted
{
    public static void main(String[] args)
    {
        int index=0;
        int ar[]=new int[5];
        Scanner s=new Scanner(System.in);
         int n =s.nextInt();
        for(int i=0; i<n; i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println(sort1(ar,index));

    }

    private static boolean sort1(int[] ar, int index)
    {
        if(index==ar.length-1)
        {
            return true;
        }
        else if(ar[0]>ar[1])
        {
            System.out.println(sort2(ar,index));

        }

        return sort1(ar,index+1);
    }
    private static boolean sort2(int[] ar, int index)
    {
        if(index==ar.length-1)
        {
            return true;
        }
        if(ar[index]<ar[index+1])
        {
            return false;
        }

        return sort2(ar,index+1);

    }
}
