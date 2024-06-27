package Hashing.Sets;
import java.util.HashMap;
import java.util.HashSet;

public class HashsetOperations {
    public static void main(String[] args) {
        //1. Create
        HashSet<Integer> hs = new HashSet<>();

        //2.add(key)   =  O(1)
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(1);
        hs.add(2);

        System.out.println(hs); //Only unique value will be printed

        //3.contains(key)  =  O(1)
        if(hs.contains(2)){
            System.out.println("Set contains 2");
        }
        if(hs.contains(3)){
            System.out.println("Set contains 3");
        }

        //4.remove(key)   =   O(1)
        hs.remove(4);
        if(hs.contains(4)){
            System.out.println("Set contains 4");
        }
        System.out.println(hs);

        //5. size()
        System.out.println(hs.size());

        //6. isEmpty()
        System.out.println(hs.isEmpty());

        //7.clear()
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());

    }
}
