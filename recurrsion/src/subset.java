import java.util.Scanner;

public class subset
{public static void main(String[] args)
{

    int j;
    Scanner s= new Scanner(System.in);
    int n = s.nextInt();
    subset(0,"abc");
}
    public static void subset(int processed, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        subset(processed+ch,unprocessed);

        subset(processed, unprocessed);
    }
}
