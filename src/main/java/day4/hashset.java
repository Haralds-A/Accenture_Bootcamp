package day4;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        String[] newarr = new String[set.size()];
        set.toArray(newarr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        };

    }
}
