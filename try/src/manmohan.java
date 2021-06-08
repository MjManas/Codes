import java.util.Scanner;

public class manmohan
{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
        for (int i = 1; i <=n ; i++)
        {
            int k = 1;
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(i);
                if(i>2)
                {
                    while(k <= i-2)
                    {
                        System.out.print("0");
                        k++;
                        j++;
                    }
                }
            }
            System.out.println();
        }
    }
}
