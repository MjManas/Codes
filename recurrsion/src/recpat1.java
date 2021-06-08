public class recpat1
{
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        pattern(4,j);
    }

    private static void pattern(int i, int j)
    {
       if(i==0)
        {
          return;
        }
       if(i==j)
         {
             System.out.println();
             pattern(i-1,0);
             return;
         }
        System.out.print("*");
       pattern(i,j+1);
    }


}
