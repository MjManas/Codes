import java.util.Scanner;

public class recfib
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter value");
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int x=fib(n);
        System.out.println(x);
    }

    private static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
       return(fib(n-1)+fib(n-2));
    }
}

