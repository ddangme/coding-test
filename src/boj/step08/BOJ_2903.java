package boj.step08;

import java.util.Scanner;

public class BOJ_2903 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pow = (int) Math.pow(2, n - 1);

        int sum = pow + pow + 1;

        System.out.println(sum * sum);
    }
}
