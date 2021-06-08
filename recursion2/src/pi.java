public class pi
{
    public static void main(String[] args)
    {
        System.out.println(convert("","pipipipip"));
    }
    public static String convert(String processed, String unprocessed)
    {

        if(unprocessed.length()<2)
        {
            return processed+unprocessed;
        }
        char ch=unprocessed.charAt(0);
        if( ch=='p' && unprocessed.charAt(1)=='i')
        {
            return convert(processed + "3.14",unprocessed.substring(2));
        }
        return convert(processed+ch,unprocessed.substring(1));
    }
}
