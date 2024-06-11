package boj.step4;

import java.util.Scanner;

public class BOJ_2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int maxNum = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                maxIndex = i;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxIndex + 1);
    }
}
