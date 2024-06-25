package Hashing.Maps;
import java.util.HashMap;

public class HashmapOperations {
    public static void main(String[] args) {
        //1. create
        HashMap<String, Integer> hm = new HashMap<>();

        //2. Insert = O(1)
        hm.put("India", 100);
        hm.put("China",120);
        hm.put("UK", 80);
        System.out.println(hm);

        //3. get = O(1)
        int population = hm.get("India");
        System.out.println(population);

        //4. containsKey = O(1)
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Indonesia"));

        //5. remove = O(1)
        hm.remove("UK");
        System.out.println(hm);

        //6. size
        System.out.println(hm.size());

        //7. isEmpty
        System.out.println(hm.isEmpty());

        //8. clear
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
