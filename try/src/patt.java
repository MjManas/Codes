import java.util.Scanner;

public class patt
{

    public static void main(String[] args)
    {
        int m;
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1; j <=n ; j++)
            {
                System.out.print("*");
                if(n%2!=0)
                {
                    m= (n/2)+1;
                    if(i<m)
                    {
                        int l = m-i;
                        for (int k = 0; k < n-(l*(2)) ; k++)
                        {

                                System.out.print(" ");

                                j++;

                        }
                    }
                    if(i==m)
                    {
                        for (int k = 0; k < i-2; k++)
                        {

                            System.out.print(" ");
                            j++;
                        }
                    }
                    if(m<i)
                    {
                        int l = i-m;
                        for (int k = 0; k < n-(l*(2)) ; k++)
                        {
                            System.out.print(" ");
                            j++;
                        }
                    }

                }
            }
            System.out.println();
        }
    }
}
