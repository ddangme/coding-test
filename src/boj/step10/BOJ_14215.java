package boj.step10;

import java.util.Scanner;

public class BOJ_14215 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];

        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();

        for (int j = 2; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        if (array[1] + array[2] > array[0]) {
            System.out.println(array[0] + array[1] + array[2]);
        } else {
            System.out.println(((array[1] + array[2]) * 2) - 1);
        }
    }
}
