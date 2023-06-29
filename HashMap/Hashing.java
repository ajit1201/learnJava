package HashMap;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // insert element in HashMap
        map.put("Ajit", 65);
        map.put("sumit", 64);
        map.put("Shrutika", 66);
        map.put("Kartik", 68);

        System.out.println(map);
        //iteraition set(1)
        for(Map.Entry<String , Integer> e : map.entrySet())
        {
            System.out.println(e);
        }
        // iteration set (2)
        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.print(key + ": ");
            System.out.println(map.get(key));
        }
        System.out.println("Key is present: " + map.containsKey("Ajit"));
        System.out.println("Value 66 is present or not " + map.containsValue(66));
        System.out.println("Value of specific key == Ajit: " +map.get("Ajit"));

        map.remove("Ajit");
        System.out.println(map);
        }
}
