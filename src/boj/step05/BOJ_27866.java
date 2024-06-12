package boj.step05;

import java.util.Scanner;

public class BOJ_27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int at = sc.nextInt() - 1;

        System.out.println(text.charAt(at));
    }
}
