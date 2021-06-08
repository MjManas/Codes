import java.util.Scanner;

public class rec2
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter value");
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int x=fact(n);
        System.out.println(x);
    }

    public static int fact(int n)
    {
         if(n==0)
        {
            return 1;
        }

        return(n*fact(n-1));

    }

}
