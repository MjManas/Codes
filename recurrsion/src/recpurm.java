import java.util.Scanner;

public class recpurm
{
    public static void main(String[] args)
    {
        int n,j=0;
        System.out.println("Enter a no");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        odd(n,2);
    }

    private static void odd(int n, int j)
    {

            if (n % 2 != 0 && n>=1)
            {
                System.out.println(n);
                odd(n-2,j);
            }


            else if (n % 2 == 0 && j<=n)
            {
                System.out.println(j);
                odd(n, j + 2);
            }
            else
                return;


    }
}
