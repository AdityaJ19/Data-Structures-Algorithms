package HashMaps;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(34);
        set.add(21);
        set.add(43);
        set.add(45);
        set.add(34);
        set.add(23);
// It didn't print the duplicate value
        System.out.println(set);
    }
}
