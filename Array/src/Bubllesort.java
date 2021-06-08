
import java.util.Scanner;

public class Bubllesort {
    public static void main(String[] args) {
        int ar[] = new int[5];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i<n;i++)
        {
            ar[i] = s.nextInt();
        }
        bubble(ar,n);
    }

    private static void bubble(int[] ar, int n)
    {

        for(int i = 0; i<n-1;i++)

    {
        for (int j = 0; j < n - i - 1; j++) {
            if (ar[j] > ar[j + 1]) {
                int k = ar[j];
                ar[j] = ar[j + 1];
                ar[j + 1] = k;
            }

        }
    }
        for(int i = 0; i<n;i++)

    {
        System.out.println(ar[i]);
    }
  }
}
