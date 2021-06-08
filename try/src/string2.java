import java.util.Scanner;

public class string2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        char ch1;
        ch1=cases(ch);
        System.out.println(ch1);
    }

    private static char cases(char ch)
    {
        if (ch>='a' && ch<='z')
        {
            return('L');
        }
        else if(ch>='A' && ch<='Z')
        {
            return('U');
        }
        else
        {
            return('I');
        }
    }
}
