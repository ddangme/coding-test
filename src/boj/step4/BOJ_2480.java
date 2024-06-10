package boj.step4;

import java.util.Scanner;

public class BOJ_2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = 0;

        boolean same = false;
        if (a == b) {
            if (a == c) {
                total = 10000 +  (a * 1000);
                same = true;
            } else {
                total = 1000 + (b * 100);
                same = true;
            }
        } else {
            if (b == c) {
                total = 1000 + (b * 100);
                same = true;
            } else if (a == c) {
                total = 1000 + (a * 100);
                same = true;
            }
        }

        if (!same) {
            total = max(a, b, c) * 100;
        }

        System.out.println(total);
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
}
