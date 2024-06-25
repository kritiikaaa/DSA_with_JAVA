package Hashing.Maps;
import java.lang.reflect.Array;
import java.util.*;
public class HashMapImplementation {
    static class HashMap<K,V>{  //K and V are generics
        private class Node{
            K key;
            V value;
            private Node(K key, V value){
                this.key = key;
                this.value =value;
            }
        }
        private int size;  //number of nodes in LinkedList (n)
        private LinkedList<Node> bucket[]; //array of linkedList (N)
        private int N; //size of array of linkedList
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%N; // 0 to size-1
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = bucket[bi];
            int di=0;
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuck[] = bucket;
            bucket = new LinkedList[N*2];
            N=N*2;
            for(int i=0; i< bucket.length; i++){
                bucket[i] = new LinkedList<>();
            }
            //nodes -> add in bucket
            for(int i=0; i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){      //O(lambda) -> O(1)
            int bi = hashFunction(key); //to find out bucket index
            int di = searchInLL(key, bi); //Data index = valid index (if key found) or -1(if key doesn't exist)

            if(di!=-1){
                Node node = bucket[bi].get(di);
                node.value = value;
            } else{
                bucket[bi].add(new Node(key, value));
                size++;
            }
            //check for rehashing
            double lambda = (double) size/N;
            if(lambda>2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){    //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di!=-1){
                return true;
            } else{
                return false;
            }
        }

        public V remove(K key){              //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di!=-1){
                Node node = bucket[bi].remove(di);
                size--;
                return node.value;
            } else{
                return null;
            }
        }

        public V get(K key){             //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di!=-1){
                Node node = bucket[bi].get(di);
                return node.value;
            } else{
               return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i=0; i<bucket.length; i++){
                LinkedList<Node> ll = bucket[i];
                for (Node node: ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return size==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);

        ArrayList<String> keys = hm.keySet();
        for (String str: keys) {
            System.out.println(str);
        }
    }
}
