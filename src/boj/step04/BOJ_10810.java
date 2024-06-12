package boj.step04;

import java.util.Scanner;

public class BOJ_10810 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int number = sc.nextInt();
            putBall(start - 1, end - 1, number, array);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void putBall(int start, int end, int number, int[] array) {
        for (int i = start; i <= end; i++) {
            array[i] = number;
        }
    }
}
