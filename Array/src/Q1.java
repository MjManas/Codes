import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        int ar[]=new int[5];
        int M[]={1,2,3,4,5};
        Scanner s=new Scanner(System.in);
        for (int i = 0; i <ar.length ; i++)
        {
         ar[i]=s.nextInt();
        }
        for (int i = 0; i <ar.length ; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
