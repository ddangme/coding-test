package gr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_175880 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long result = 1L;
        for (int i = 1; i <= n; i++) {
            result = result * i % 1000000007;
        }

        System.out.println(result);
    }
}
