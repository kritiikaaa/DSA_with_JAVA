package Hashing.Maps;
import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("UK", 50);
        tm.put("China",150);
        tm.put("Indonesia", 6);
        tm.put("Nepal",5);
        System.out.println(tm);
    }
}
