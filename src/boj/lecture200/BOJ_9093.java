package boj.lecture200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9093 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            String[] arrays = br.readLine().split(" ");
            for (int j = 0; j < arrays.length; j++) {
                display(arrays[j]);
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void display(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }

        sb.append(" ");
    }
}
