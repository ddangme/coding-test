package boj.step6;

import java.util.Scanner;

public class BOJ_1316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        int result = 0;
        for (int i = 0; i < count; i++) {
            String text = sc.nextLine();

            if (isGroupWord(text)) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean isGroupWord(String text) {
        for (int i = 0; i < text.length(); i++) {
            String keyword = String.valueOf(text.charAt(i));
            int lastIndex = text.lastIndexOf(keyword);

            for (int j = i + 1; j < lastIndex; j++) {
                if (text.charAt(j) != text.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
