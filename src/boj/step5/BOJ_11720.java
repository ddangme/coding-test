package boj.step5;

import java.util.Scanner;

public class BOJ_11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        int result = 0;
        String text = sc.nextLine();
        for(int i = 0; i < count; i++) {
            result += Integer.parseInt(String.valueOf(text.charAt(i)));
        }

        System.out.println(result);
    }
}
