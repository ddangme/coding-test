package boj.step03;

// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class BOJ_8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int data = 0;


        for (int i = 1; i <= number; i++) {
            data += i;
        }

        System.out.println(data);
    }
}
