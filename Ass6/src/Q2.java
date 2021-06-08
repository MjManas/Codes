public class Q2
{
    public static void main(String[] args)
    {
     int n;
     int i=1;
     int j=1;
     pattern(5,i,j);
    }

    private static void pattern(int n, int i, int j)
    {
        if(i>n)
        {
            return;
        }
        if(j>i)
        {
            System.out.println();
            pattern(n,i+1,1);
            return;
        }
        System.out.print("*");
        pattern(n,i,j+1);

    }
}
