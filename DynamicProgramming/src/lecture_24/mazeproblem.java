package lecture_24;

import java.math.BigInteger;
import java.util.Arrays;

public class mazeproblem
{
    public static void main(String[] args)
    {
      int row=4;
      int col=4;
      BigInteger mem[][] = new BigInteger[row+1][col+1];
        System.out.println(maze(row,col,mem));
    }
   public static int maze(int row , int col)
   {
       if( row == 1|| col == 1)
       {
           return 1;
       }
       return maze(row-1,col)+maze(row,col-1);
   }
    public static BigInteger maze(int row , int col, BigInteger[][] mem)
    {
        if( row == 1|| col == 1)
        {
            return BigInteger.ONE;
        }
        if(mem[row][col]!=null)
        {
            return mem[row][col];
        }
        mem[row][col] = maze(row-1,col,mem).add(maze(row,col-1,mem));
        return mem[row][col];
    }
    public static BigInteger mazeitr(int row , int col, BigInteger[][] mem)
    {
        for (int r = 1; r <=row ; r++)
        {


        for(int c=1;c<=col;c++)
        {
           if(r == 1|| c==1)
           {
               mem[r][c]=BigInteger.ONE;
           }
           else
               {
               mem[r][c]=mem[r-1][c].add(mem[r][c-1]);
           }
        }

        }
    return mem[row][col];
    }
}
