package boj.step12;

import java.util.Scanner;

public class BOJ_19532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x = -999;

        while (x < 1000) {
            int y = -999;
            while (y < 1000) {
                if (((a * x) + (b * y) == c && (d * x) + (e * y) == f)) {
                    System.out.println(x + " " + y);
                    break;
                } else {
                    y++;
                }
            }
            x++;
        }
    }
}
