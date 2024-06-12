package boj.step06;

import java.util.Scanner;

public class BOJ_10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int result = 1;

        if (text.length() == 1) {
            System.out.println(result);
        } else {
            int centerIndex = (text.length() / 2) + (text.length() % 2);

            for (int i = 0; i <= centerIndex; i++) {
                if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                    result = 0;
                }
            }
            System.out.println(result);
        }
    }
}
