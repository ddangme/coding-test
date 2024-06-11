package boj.step4;

import java.util.Scanner;

public class BOJ_5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] booleans = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int index = sc.nextInt();
            booleans[index - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!booleans[i]) {
                System.out.println(i + 1);
            }
        }



    }
}
