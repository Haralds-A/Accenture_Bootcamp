package day2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" input number one");
        int value_1 = sc.nextInt();
        System.out.println("input number two");
        int value_2 = sc.nextInt();

        System.out.println("is "+value_1+" equal to " +value_2+"? - "+(value_1==value_2));
        System.out.println("is "+value_1+" less than " +value_2+"? - "+(value_1<value_2));
        System.out.println("is "+value_1+" less than or equal to " +value_2+"? - "+(value_1<=value_2));
        System.out.println("is "+value_1+" greater than " +value_2+"? - "+(value_1>value_2));
        System.out.println("is "+value_1+" greater than or equal to " +value_2+"? - "+(value_1>=value_2));

    }
}