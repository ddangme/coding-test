package solved.class2;

import java.util.Scanner;

public class BOJ_1259 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String text = sc.nextLine();

            if (text.charAt(0) == '0') {
                break;
            }

            char[] array1 = new char[text.length() / 2];
            char[] array2 = new char[text.length() / 2];


            for (int i = 0; i < array1.length; i++) {
                array1[i] = text.charAt(i);
            }

            for (int i = array2.length - 1; i >= 0; i--) {
                array2[i] = text.charAt(text.length() - 1 - i);
            }

            boolean isYes = true;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    isYes = false;
                }
            }

            if (isYes) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
