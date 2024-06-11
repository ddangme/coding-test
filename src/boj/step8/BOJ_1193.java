package boj.step8;

import java.util.Scanner;

public class BOJ_1193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int x = 1;
        int y = 1;

        for (int i = 1; i < index; i++) {
            if (sumIsEven(x, y)) {
                if (x == 1) {
                    y++;
                } else {
                    x--;
                    y++;
                }
            } else {
                if (y == 1) {
                    x++;
                } else {
                    x++;
                    y--;
                }
            }
        }

        System.out.println(x + "/" + y);
    }

    public static boolean sumIsEven(int x, int y) {
        int sum = x + y;

        return sum % 2 == 0;
    }
}
