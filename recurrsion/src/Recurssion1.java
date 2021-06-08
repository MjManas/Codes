public class Recurssion1
{
    public static void main(String[] args)
    {
     int n=5;
     printdec(n);
    }

    public static void printdec(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Dec order");
        System.out.println(n);
        printdec(n-1);
        System.out.println("Inc order");
        System.out.println(n);
    }

}
