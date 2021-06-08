import java.util.Scanner;


public class oddeven
{
    public static void main(String[] args)
    {
        int m;
        Scanner s=new Scanner(System.in);
        short n= (short) s.nextInt();
        int car;
        for (int i = 1; i <=n ; i++)
        {
            car=s.nextInt();

            int k=0;
            while(car>0)
             {
              m=car%10;
              car=car/10;
              k=k+m;
             }
            if(k%2==0)
            {
                if(k%4==0)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
            else if(k%2!=0)
            {
                if(k%3==0)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }

    }
}

