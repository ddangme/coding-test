package boj.lecture200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        int[] list = new int[loop];

        int count = 0;
        for (int i = 0; i < loop; i++) {
            String text = br.readLine();

            if (text.contains(" ")) {
                String[] split = text.split(" ");
                list[count] = Integer.parseInt(split[1]);
                count++;
            } else if (text.contains("top")) {
                if (count == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(list[count - 1]);
                }
            } else if (text.contains("pop")) {
                if (count == 0) {
                    System.out.println("-1");
                }  else {
                    System.out.println(list[count - 1]);
                    list[count - 1] = 0;
                    count--;
                }
            } else if (text.contains("size")) {
                System.out.println(count);
            } else {
                if (count == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
