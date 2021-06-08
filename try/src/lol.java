import java.util.Scanner;


public class lol
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        mazepath("",n,m,n,m);
    }
    public static void mazepath(String processed,int row,int col,int n,int m)
    {
        if(row==n && col==m)
        {
            System.out.println(processed);
            return;
        }

        if (col <m)
        {
            mazepath(processed,row,col+1,n,m);

        }
        else
        {
            System.out.println();
            mazepath(processed ,row+1,col,n,m);

        }
    }
}
