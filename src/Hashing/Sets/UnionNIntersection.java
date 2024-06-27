package Hashing.Sets;
import java.util.*;

public class UnionNIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,9,3,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        //Union
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Union set"+set+" ("+set.size()+")");

        //Intersection
        set.clear();
        int count=0;
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Number of elements in Intersection set: "+count);
    }
}
