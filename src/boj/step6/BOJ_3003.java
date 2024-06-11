package boj.step6;

import java.util.Scanner;

public class BOJ_3003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] expect = {1, 1, 2, 2, 2, 8};

        String[] input = sc.nextLine().split(" ");

        for (int i = 0; i < expect.length; i++) {
            System.out.print(expect[i] - Integer.parseInt(input[i]));
            System.out.print(" ");
        }
    }
}
