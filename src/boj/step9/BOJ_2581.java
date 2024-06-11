package boj.step9;

import java.util.Scanner;

public class BOJ_2581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int min = 0;
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (check(i)) {
                if (min == 0) {
                    min = i;
                }
                sum += i;
            }
        }

        if (min == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    public static boolean check(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
