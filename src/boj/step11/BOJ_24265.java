package boj.step11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_24265 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println((n * (n - 1)) / 2);
        System.out.println(2);

    }
}