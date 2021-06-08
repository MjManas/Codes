import java.util.Scanner;

public class mj2 {
    public static void main(String[] args)
    {
        int a;
        int b;
        System.out.println("Enter the two nos.");
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        GCD(a,b);


    }

    private static void GCD(int a, int b)
    {
        int i;
        int k=0;
        int l=0;
       for(i=1;i<=a;i++)
       {
           if(a%i==0)
           {
               k=i;
           }
            for(int j=1;j<=b;j++)
            {
                if(b%j==0&&j==k)
                {
                    l=k;
                }
            }

       }
        System.out.println("GCD IS" + l);
    }
}
