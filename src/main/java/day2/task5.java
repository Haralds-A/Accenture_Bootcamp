package day2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a boolean value");
        boolean value_1 = sc.nextBoolean();
        System.out.println(" the oposite value of the given boolean input is \""+!value_1+"\"");
    }
}
