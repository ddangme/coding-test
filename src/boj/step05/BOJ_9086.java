package boj.step05;

import java.util.Scanner;

public class BOJ_9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            String text = sc.nextLine();
            System.out.print(text.charAt(0));
            System.out.println(text.charAt(text.length() - 1));
        }
    }
}
