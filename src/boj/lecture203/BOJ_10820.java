package boj.lecture203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10820 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String text;

        while ((text = br.readLine()) != null) {
            int[] count = new int[4];
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    count[3]++;
                } else if (Character.isLowerCase(text.charAt(i))) {
                    count[0]++;
                } else if (Character.isUpperCase(text.charAt(i))) {
                    count[1]++;
                } else {
                    count[2]++;
                }
            }
            sb.append(count[0] + " " + count[1] + " " + count[2] + " " + count[3] + "\n");
        }
        System.out.println(sb);
    }
}
/*
문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.

각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.

This is String
SPACE    1    SPACE
 S a M p L e I n P u T
0L1A2S3T4L5I6N7E8


10 2 0 2
0 10 1 8
5 6 0 16
0 8 9 0
 */