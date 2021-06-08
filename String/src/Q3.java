public class Q3
{
    public static void main(String[] args)
    {
        String s="Hello!";
        String line="Hello!";

//        System.out.println(s.equals(line));
//        System.out.println(s.charAt(0));
//        System.out.println(s.indexOf("e"));
//        line=line.concat(s);
//        System.out.println(line);
//        System.out.println(s.substring(1,3));
        substring(s);
    }
    public static void substring(String s)
    {
        for (int i = 0; i <s.length() ; i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.println(s.substring(i,j));
            }

        }
    }
}
