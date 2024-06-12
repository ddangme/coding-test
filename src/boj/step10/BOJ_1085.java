package boj.step10;

import java.util.Scanner;

public class BOJ_1085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minX = min(x, w);
        int minY = min(y, h);

        if (minX < minY) {
            System.out.println(minX);
        } else {
            System.out.println(minY);
        }
    }

    public static int min(int a, int b) {
        if (b - a < a) {
            return b - a;
        }
        return a;
    }
}
