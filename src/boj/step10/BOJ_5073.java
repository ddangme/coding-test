package boj.step10;

import java.util.Scanner;

public class BOJ_5073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a == b && a == c) {
                System.out.println("Equilateral");
            } else if (validate(a, b, c)) {
                if (a != b && b != c && a != c) {
                    System.out.println("Scalene");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                }
            } else {
                System.out.println("Invalid");
            }
        }

    }

    public static boolean validate(int a, int b, int c) {
        if (a >= b && a >= c) {
            return ok(a, b, c);
        }

        if (b >= a && b >= c) {
            return ok(b, a, c);
        }

        if (c >= a && c >= b) {
            return ok(c, a, b);
        }

        return false;
    }

    public static boolean ok(int max, int x, int y) {
        if (max < x + y) {
            return true;
        }

        return false;
    }
}
