package Hashing.Sets;
import java.util.*;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bengaluru");
        cities.add("Noida");

        //Case-1: Using Iterator
        Iterator  it= cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        //Case-2: Using enhanced for loop
        for(String city: cities){
            System.out.println(city);
        }
    }
}
