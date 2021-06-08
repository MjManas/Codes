public class Ass1
{
    public static void main(String[] args)
    {
        String s = "Hello";
        StringBuilder builder=new StringBuilder(s);
        for (int i = 0; i <builder.length() ; i++)
        {
            char ch = builder.charAt(i);
        }
    }
}
