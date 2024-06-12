package boj.step09;

import java.util.Scanner;

public class BOJ_1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = Integer.parseInt(sc.nextLine());

        int count = 0;

        for (int i = 0; i < loop; i++) {
            if (isCount(sc.nextInt())) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isCount(int number) {
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
