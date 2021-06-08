import java.util.HashSet;
import java.util.Set;

public class setexample
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        int [] items= {1,1,0,2,0,1};
        int [] nums= {1,3,0,1,0,1};
        for (int i = 0; i <items.length ; i++)
        {
            set.remove(items[i]);
        }
        for (int i = 0; i <items.length ; i++)
        {
            set.add(nums[i]);
        }
        System.out.println(set);
    }
}
