package Hashing.Maps;
import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("UK", 50);
        lhm.put("China",150);
        lhm.put("Indonesia", 6);
        lhm.put("Nepal",5);
        System.out.println(lhm);
    }
}
