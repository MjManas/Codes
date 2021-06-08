import java.util.Scanner;

import static java.lang.Math.pow;

public class mj {
    public static void main(String[] args)
    {
        int n;
        int a,b;
        System.out.printf("Enter the no.");
        Scanner s= new Scanner(System.in);
        n=s.nextInt();

        armstrong(n);
        System.out.println("Enter two nos.");
        a=s.nextInt();
        b=s.nextInt();
        count(a,b);
    }


    public static void count(int a, int b)
    {
        int rem;
        int d=0;
        double y=0;
        int c=a;
        while(c<=b)
        {
            double l=c;
            while(c>0)
            {
                rem=c%10;
                c=c/10;
                y=y+pow(rem,3);

            }
            if(y == l)
            {
                System.out.println(y);
            }
            c=a+d;
            d++;
            c++;
        }
    }

    private static void armstrong(int n)
    {
      double rem=0;
      int x=n;
      double y=0;
      while(n>0)
      {
          rem=n%10;
          n=n/10;
          y=y+pow(rem,3);

      }
      if(y==x)
      {
          System.out.println("NO. is armstrong");
      }
    }
}
