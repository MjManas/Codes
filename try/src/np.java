import java.util.Scanner;

public class np
{
    public static void main(String[] args) {
        int a = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    a++;
                    System.out.println("Not Prime");
                }
            }
        }
        if (a == 0) {
            System.out.println("Prime");
        }
    }
}


