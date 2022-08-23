package day4;

import java.util.HashMap;

    public class hashmap {
        public static void main(String[] args) {
            HashMap<Integer,String> map= new HashMap<Integer,String>();
            map.put(1, "Red");
            map.put(2, "Green");
            map.put(3, "Black");
            map.put(4, "White");
            map.put(5, "Blue");

            HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
            new_hash_map = (HashMap)map.clone();

        }
}
