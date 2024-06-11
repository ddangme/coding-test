package boj.step5;

import java.util.Scanner;

public class BOJ_1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");

        int count = 0;

        for (String s : array) {
            if (!s.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
