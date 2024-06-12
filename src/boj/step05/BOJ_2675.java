package boj.step05;

import java.util.Scanner;

public class BOJ_2675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < S; i++) {
            String input = sc.nextLine();

            String[] split = input.split(" ");
            int loop = Integer.parseInt(split[0]);
            String text = split[1];

            for (int index = 0; index < text.length(); index++) {
                for (int j = 0; j < loop; j++) {
                    System.out.print(text.charAt(index));
                }
            }

            System.out.println();
        }
    }
}
