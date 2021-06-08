public class func
{
    public static void main(String[] args)
    {
     p4();
    }

    private static void p4()
    {
        System.out.println("4");

        p3();
        System.out.println("4");
    }

    private static void p3()
    {
        System.out.println("3");
        p2();
        System.out.println("3");
    }

    private static void p2()
    {
        System.out.println("2");
        p1();
        System.out.println("2");
    }

    private static void p1()
    {
        System.out.println("1");
    }
}
