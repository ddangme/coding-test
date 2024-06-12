package boj.step06;

import java.util.Scanner;

public class BOJ_2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] keywords = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String keyword : keywords) {
            input = input.replace(keyword, "!");
        }

        System.out.println(input.length());
    }
}
