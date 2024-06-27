package Hashing.Sets;
import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bengaluru");
        cities.add("Noida");

        System.out.println(cities); // ordered set will be printed
    }
}
