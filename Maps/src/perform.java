import java.util.Hashtable;

public class perform
{
    public static void main(String[] args) {
        Hashtable<Integer, Integer> map= new Hashtable<>();
        for (int i = 0; i <1000000 ; i++)
        {
         map.put(i,i);
        }
        for (int i = 0; i <1000000 ; i++)
        {
            System.out.println(map.get(i));

        }
    }
}
