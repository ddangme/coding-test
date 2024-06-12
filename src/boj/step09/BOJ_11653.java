package boj.step09;

import java.util.Scanner;

public class BOJ_11653 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int i = 2;

        if (number == 1) {

        } else {
            while (number >= i) {
                if (number % i == 0) {
                    System.out.println(i);
                    number /= i;
                    i = 2;
                } else {
                    i++;
                }
            }
        }

    }
}
