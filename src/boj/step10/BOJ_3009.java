package boj.step10;

import java.util.Scanner;

public class BOJ_3009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arrays = new int[3][2];

        for (int i = 0; i < 3; i++) {
            String[] split = sc.nextLine().split(" ");
            arrays[i][0] = Integer.parseInt(split[0]);
            arrays[i][1] = Integer.parseInt(split[1]);
        }

        for (int i = 0; i < 2; i++) {
            if (arrays[0][i] == arrays[1][i]) {
                System.out.print(arrays[2][i] + " ");
            } else if (arrays[1][i] == arrays[2][i]) {
                System.out.print(arrays[0][i] + " ");
            } else {
                System.out.print(arrays[1][i] + " ");
            }
        }
    }
}
