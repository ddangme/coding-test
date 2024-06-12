package boj.step04;

import java.util.Scanner;

public class BOJ_10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int find = sc.nextInt();

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == find) {
                count++;
            }
        }

        System.out.println(count);
    }
}
