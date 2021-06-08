public class Q2
{
    public static void main(String[] args)
    {
        //int ar[][]=new int[2][3];
        //int[ ][ ] arr = new int[3][ ];
        //arr[0] = new int[3];
        //arr[1] = new int[5];
        //arr[2] = new int[4];
        int ar[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i <ar.length ; i++)
        {
         if(i==0||i%2==0)
           {
             for (int j = 0; j < ar[i].length; j++)
             {
                 System.out.print(ar[i][j] +",");
             }
           }
         else
         {
             for(int j=ar[i].length-1;j>=0;j--)
             {
                 System.out.print(ar[i][j] +",");
             }
         }

        }

    }
}
