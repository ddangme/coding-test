package boj.step4;

import java.util.Scanner;

public class BOJ_2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int timeM = sc.nextInt();

        int minute = m + timeM;

        if (minute >= 60) {
            h += (minute / 60);
            m = (minute % 60);
        } else {
            m = minute;
        }

        if (h >= 24) {
            h %= 24;
        }

        System.out.println(h + " " + m);
    }
}
