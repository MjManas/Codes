import java.util.Scanner;

public class cjv
{
    public static void main(String[] args)
    {
        int n;
        int m;
        int j=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for (int i = 0; i <n ; i++)
        {
            m=s.nextInt();

            j=j+m;
            if(j>0)
            {
                System.out.println(m);

            }
            else
            {
                break;
            }
        }

    }
}
