package boj.lecture203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10824 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] text = br.readLine().split(" ");

        System.out.println(Long.parseLong(text[0] + text[1]) + Long.parseLong(text[2] + text[3]));
    }
}
