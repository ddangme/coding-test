package boj.step3;

import java.util.Scanner;

public class BOJ_11022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Case #" + i + ": " + x + " + " + y + " = " + (x + y));
        }
    }
}
