import java.util.Scanner;

public class hello
{
    public static void main(String args[])
    {
        int i=1;
        int j=1;
        int k=1;
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {

                    System.out.print(i);
                    j++;
                    for(k=1;k<=i-2 && j<=i ;k++)
                    {
                        System.out.print("0");
                        j++;
                    }
                if(j<=i)
                {
                    System.out.print(i);
                }
            }
            System.out.println();
        }

    }
}
