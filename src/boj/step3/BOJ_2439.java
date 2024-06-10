package boj.step3;

import java.util.Scanner;

public class BOJ_2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            printBlank(count - i);
            printStar(i);
        }
    }

    public static void printBlank(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static void printStar(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
