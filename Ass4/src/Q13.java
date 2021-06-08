import java.util.Scanner;

public class Q13
{
    public static void main(String[] args)
    {
        int i;
        int j;
        int k;
        int ar[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of 1st array");
        int x = s.nextInt();
        System.out.println("ENter target");
        int m = s.nextInt();
        System.out.println("Enter first array");
        for (i = 0; i < x - 1; i++)

           {
            ar[i] = s.nextInt();
           }
        for (i = 0; i < x - 1; i++)

           {
            for (j = 0; j < x - 1; j++)

              {
                for (k = 0; k < x - 1; k++)

                  {
                    if (ar[i] + ar[j] + ar[k] == m)
                    {
                        System.out.println(ar[i] + " + " + ar[j] + " + " + ar[k]);
                    }
                  }
              }

           }
    }
}
