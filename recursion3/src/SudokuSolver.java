import java.util.Scanner;
import java.util.Arrays;
public class SudokuSolver
{
    public static void main(String[] args)
    {
       int[][] board= new int[][]
        {
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };
       Scanner s=new Scanner(System.in);
        for (int i = 0; i <9 ; i++)
        {
            for (int j = 0; j <9 ; j++)
            {
             board[i][j]=s.nextInt();
            }
        }
        sudoku(board,0,0);
    }
    public static void display(int[][] board)
    {
        for (int i = 0; i <board.length ; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
    public static void sudoku(int[][] board,int row,int col)
    {
        if(row == board.length)
        {
            //display
            display(board);
            return;
        }
        if(col == board.length)
        {
            sudoku(board, row+1, 0);
             return;
        }
        if(board[row][col] == 0)
        {
            for (int val = 1; val <= 9 ; val++)
            {
             if(isSafe(board,row,col,val))
             {
                 board[row][col]=val;
                 sudoku(board, row, col+1);
                 board[row][col] = 0;
             }
            }
        }
        else
        {
            sudoku(board, row, col+1);
        }
    }
    private static boolean isSafe(int[][] board, int row, int col,int val)
    {
        for (int r = 0; r < board.length ; r++)
        {
         if(board[r][col] == val)
         {
             return false;
         }
        }
        for (int c = 0; c < board.length; c++)
        {
         if(board[row][c] == val)
             return false;
        }
        int r_block=row/3;
        int c_block=col/3;
        for (int r =3*r_block ; r <3*(r_block+1) ; r++)
        {
            for (int c =3*c_block ; c <3*(c_block+1) ; c++)
            {
                if(board[r][c]==val)
                {
                  return false;
                }
            }
        }
      return true;
    }
}
