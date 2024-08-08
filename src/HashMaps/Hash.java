package HashMaps;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

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
