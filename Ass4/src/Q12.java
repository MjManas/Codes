import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        int i;
        int j;
        int ar[] = new int[5];
        int ar1[] = new int[5];
        int ar2[]= new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of 1st array");
        int x = s.nextInt();
        System.out.println("ENter the size of scnd array");
        int y = s.nextInt();
        System.out.println("Enter first array");
        for (i = 0; i < x; i++)

        {

            ar[i] = s.nextInt();

        }
        System.out.println("ENter second array");
        for (j = 0; j < y; j++)
        {

            ar1[j] = s.nextInt();

        }
        for (i = 0; i < x; i++)
            {
                for (j = 0; j < y; j++)
                {
                    if(ar[i]==ar1[j])
                    {
                        ar2[i]=ar[i];
                    }
                }
            }
        System.out.println(Arrays.toString(ar2));
    }
}