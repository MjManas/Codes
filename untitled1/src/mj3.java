import java.util.Scanner;


public class mj3 {
    public static void main(String[] args)
    {
        int l;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no and its power");
        int x= s.nextInt();
        int n= s.nextInt();
        l=Power(x,n);
        System.out.println(l);
    }

    private static int Power(int x, int n)
    {
        int m = 1;
        int i=1;
        while(i<=n)
        {
            m=m*x;
            i++;
        }
        return m;
    }
}
