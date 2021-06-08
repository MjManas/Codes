public class nqueens
{
    public static void main(String[] args)
    {
     int n=4;
     boolean board[][]=new boolean[n][n];
    nqueens(board,0);
    }
    public static void nqueens(boolean board[][],int row) {
        if (row == board.length) {
            display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                nqueens(board, row + 1);                 //recursive function
                board[row][col] = false;
            }
        }
    }
    private static boolean issafe(boolean[][] board, int row, int col)
    {
        int l=0;
        //vertical
        for (int i = 0; i <row ; i++)
        {
         if(board[i][col])
         {
             return false;
         }
        }
        //left diagonal
        for (int i = 1; i <=Math.min(row,col) ; i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }
        //right diagonal

        for(int i=1;i<Math.min(row,board.length-col-1);i++)
        {
            if(board[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board)
    {
        for (int i = 0; i <board.length ; i++)
        {
            for (int j = 0; j <board[i].length ; j++)
            {
             if(board[i][j])
             {
                 System.out.print("Q ");
             }
             else
             {
                 System.out.print("X ");
             }
            }
            System.out.println();
        }
        System.out.println();

    }

}
