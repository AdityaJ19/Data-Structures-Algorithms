package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        //treemap stores the data in sorted order

        map.put("Aditya", 78);
        map.put("Arpit", 84);
        map.put("Akash", 81);
        map.put("Arman", 97);
        map.put("Anshul", 98);
        System.out.println(map.get("Aditya"));
        System.out.println(map.getOrDefault("Dushyant", 404));
        System.out.println(map.keySet());
    }
}
