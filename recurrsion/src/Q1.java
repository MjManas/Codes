public class Q1
{
    public static void main(String[] args)
    {
     String s= "Hello";

     System.out.println('c'-'a');
     StringBuilder builder=new StringBuilder(s);
     builder.append("World");
     System.out.println(builder);
     builder.setCharAt(0,'M');
     System.out.println(builder);
        for (int i = 0; i <builder.length() ; i++)
        {
            char ch=builder.charAt(i);
            if(ch>='A'&& ch<='Z')
              {
                  ch = (char)('a' + (ch - 'A'));
              }
            else if(ch>='a'&& ch<='z')
            {
                ch = (char)('A' + (ch - 'a'));
            }
            builder.setCharAt(i,ch);

        }
        System.out.println(builder);
    }

}
