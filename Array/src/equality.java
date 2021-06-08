import java.util.Scanner;

public class equality
{
    public static void main(String[] args)
    {
        int ar1[]=new int[5];
        int ar2[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int n= s.nextInt();
        int m=s.nextInt();
        if(m!=n)
        {
            System.out.println("Invalid Input!");
        }
        else {
            System.out.println("Enter the array");
            for (int i = 0; i < n; i++)
            {
                ar1[i] = s.nextInt();
            }
            for (int i = 0; i < m; i++)
            {
                ar2[i] = s.nextInt();
            }
            equal(ar1, ar2, n, m);
        }
}

    private static void equal(int[] ar1, int[] ar2, int n, int m)
    {
        int l=0;
        for (int i = 0; i <n ; i++)
            {
             if(ar1[i]==ar2[i])
             {
                l++;
             }
            }

        if(l==n)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Unequal Arrays");
        }
    }

}
