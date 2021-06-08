import java.util.ArrayList;

public class ArrayListclient
{
    public static void main(String[] args)
    {
        ArrayList a= new ArrayList();
        for (int i = 0; i <100 ; i++)
        {
         a.add(i);
        }
        for (int i = 0; i <100 ; i++)
            System.out.println(a.remove(i));
    }
}
