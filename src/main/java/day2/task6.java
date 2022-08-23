package day2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number a");
        int a = sc.nextInt();
        System.out.println("input number b");
        int b = sc.nextInt();
        System.out.println("a is  "+a+" and b is "+b+" ->"+(a==b || a<0&&b>0 || a>100&&b>100));
    }
}
