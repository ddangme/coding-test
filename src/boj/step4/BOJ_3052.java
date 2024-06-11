package boj.step4;

import java.util.Scanner;

public class BOJ_3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] array = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            int index = input % 42;
            array[index] = true;
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                count++;
            }
        }

        System.out.println(count);

    }
}
