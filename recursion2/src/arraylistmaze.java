import java.util.ArrayList;

public class arraylistmaze
{
    public static void main(String[] args)
    {
        ArrayList list= new ArrayList();
        System.out.println(mazepath("",3,3,list));
    }
    public static ArrayList mazepath(String processed,int row,int col, ArrayList list) {
        if (row == 1 && col == 1) {
            list.add(processed);
            return list;
        }
        if (row > 1) {
           return mazepath(processed + row + "," + col + " ", row - 1, col,list);

        }
        if (col > 1) {
           return mazepath(processed + row + "," + col + " ", row, col - 1,list);

        }
        return list;
    }
}
