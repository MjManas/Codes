import java.util.Scanner;

public class DieProblem
{
    public static void main(String[] args)
    {
     int target;

     Scanner s= new Scanner(System.in);
     target=s.nextInt();
     dice("" ,target);
    }

    private static void dice(String processed, int target)
    {
     if(target==0)
     {
         System.out.println(processed);
         return;
     }
        for (int i = 1; i <=6 && i<= target; i++)
        {

            dice(processed+i,target-i);
        }
    }
}
