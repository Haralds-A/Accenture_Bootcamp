package day4;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int to_replace_with = 6;

        System.out.println("original list = "+list);
        list.set(1,to_replace_with);
        System.out.println("new list = "+list);
    }

}
