import java.util.Scanner;

public class microsoftQ
{
    public static void main(String[] args)
    {
        int k=0;

        int l=0;
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        ques(k,l,n,s);
    }

    private static void ques(int k, int l, int n, Scanner s)
    {
        int r=0;
        for(int i=0;i<100000;i++)
        {//
            int j=i;
            while(j>0)
            {
                r= j%10;
                j=j/10;
                k=k+r;
            }
            if(k==10)
            {
                l++;
                if(l==n)
                {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
