package lecture_24;

public class EggDrop
{
    public static void main(String[] args) {

    }
    public static int eggDrop(int eggs, int floors)
    {
        if(floors==0)                              //base condition
        {
            return 0;
        }
        if(eggs == 1)                              //base condition
        {
            return floors;
        }
        int best= floors;                         //this will be the worst condition
        for (int f = 1; f <= floors ; f++)
        {
         int up = eggDrop(eggs,floors-f);
         int down = eggDrop(eggs-1,f-1);
         int worst = Math.max(up,down) + 1;
         if(worst < best)
         {
             best = worst;
         }
        }
        return best;
    }
}
