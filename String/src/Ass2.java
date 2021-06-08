public class Ass2
{
    public static void main(String[] args)
    {
        String s = "IAMMANAS";
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i <builder.length(); i++)
        {
            int k=0;
            for(int j=0;j<builder.length();j++)
            {
                if(builder.charAt(j) == builder.charAt(i))
                {
                    k++;
                }
                if(k>1)
                {
                    builder.deleteCharAt(j);
                }
            }
        }
        System.out.println(builder);
    }
}
