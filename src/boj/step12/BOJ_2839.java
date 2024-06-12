package boj.step12;

import java.util.Scanner;

public class BOJ_2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 999999999;

        for (int count5Kg = 0; count5Kg < (n / 5) + 1; count5Kg++) {
            int remain = n - (count5Kg * 5);
            if (remain % 3 == 0 && count5Kg + (remain / 3) < result) {
                result = count5Kg + (remain / 3);
            }
        }

        if (result == 999999999) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
