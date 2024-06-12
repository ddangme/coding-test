package boj.step08;

import java.util.Scanner;

public class BOJ_2869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plus = sc.nextInt();
        int minus = sc.nextInt();
        int height = sc.nextInt();

        int day = (height - minus) / (plus - minus);

        if ((height - minus) % (plus - minus) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
