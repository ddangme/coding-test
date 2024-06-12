package boj.step06;

import java.util.Scanner;

public class BOJ_2444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printBlank(n - i);
            printStar((2 * i) - 1);
        }

        for (int i = n - 1; i >= 0; i--) {
            printBlank(n - i);
            printStar((2 * i) - 1);
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
