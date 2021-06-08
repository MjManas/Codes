import java.util.Scanner;

public class l
{
    private static void conv(int a)
    {
        int n;
        int dec=0;
        int r=1;
        while(a>0)
        {
            n=a%10;
            a=a/10;
            dec=dec+n*r;
            r=r*2;
        }
        System.out.println(dec);
    }

    public static void main(String[] args)
    {

        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        conv(a);
    }
}
