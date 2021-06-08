package lecture18;

import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args)
    {
        Map<String,String> map=new HashMap<>();
        map.put("apple","A sweet red fruit");
        map.put("mango","King of fruits");
        System.out.println(map.get("apple"));
        System.out.println(map.toString());
    }
}
