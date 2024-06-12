package boj.step10;

import java.util.Scanner;

public class BOJ_9063 {
        static int minX = 100001;
        static int minY = 100001;
        static int maxX = -100001;
        static int maxY = -100001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            checkMinAndMax(x, y);
        }
        displayResult();
        sc.close();
    }

    public static void displayResult() {
        if (maxX - minX == 0 || maxY - minY == 0) {
            System.out.println(0);
        } else {
            System.out.println((maxX - minX) * (maxY - minY));
        }
    }

    public static void checkMinAndMax(int x, int y) {
        if (x < minX) {
            minX = x;
        }
        if (x > maxX) {
            maxX = x;
        }
        if (y < minY) {
            minY = y;
        }
        if (y > maxY) {
            maxY = y;
        }
    }
}
