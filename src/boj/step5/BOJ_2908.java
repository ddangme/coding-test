package boj.step5;

import java.util.Scanner;

public class BOJ_2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = sc.nextLine().split(" ");

        int[] ints = new int[2];

        for (int index = 0; index < 2; index++) {
            String text = "";
            for (int i = 2; i >= 0; i--) {
                char c = strings[index].charAt(i);
                text += c;
            }
            ints[index] = Integer.parseInt(text);
        }

        if (ints[0] > ints[1]) {
            System.out.println(ints[0]);
        } else {
            System.out.println(ints[1]);
        }
    }
}
