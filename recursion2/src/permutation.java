import java.util.Scanner;

public class permutation
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str= s.nextLine();
        permutation("",str);
    }
    public static void permutation(String processed, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for (int i = 0; i <= processed.length() ; i++)
        {

            String first=processed.substring(0,i);
         String second=processed.substring(i);
         permutation(first+ch+second,unprocessed);
        }
    }
}
