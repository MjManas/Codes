public class Q4
{
    public static void main(String[] args)
    {
        int j=0;
        String s="Wow";
         for (int i = 0; i <s.length()/2 ; i++)
         {
             if (s.charAt(i) != s.charAt(s.length() - i - 1))
             {
                 j++;
             }
         }
         if(j==0)
             System.out.println("Palindrome!");
              else
                  System.out.println("Not Palindrome!");


    }
}
