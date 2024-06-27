package Hashing.Sets;
import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bengaluru");
        cities.add("Noida");

        System.out.println(cities); // sorted set will be printed
    }
}
