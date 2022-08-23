package day2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first boolean value");
        boolean value_1 = sc.nextBoolean();

        System.out.println("input second boolean value");
        boolean value_2 = sc.nextBoolean();

        System.out.println(" is b1 and b2 equal? - "+(value_1==value_2));

    }
}
