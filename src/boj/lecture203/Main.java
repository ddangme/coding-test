package boj.lecture203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                int index = (text.charAt(i) + 13);
                if (index > 'Z') {
                    index = index - 26;
                }
                sb.append(Character.toChars(index));
            } else if (Character.isLowerCase(text.charAt(i))) {
                int index = (text.charAt(i) + 13);
                if (index > 'z') {
                    index = index - 26;
                }
                sb.append(Character.toChars(index));
            } else {
                sb.append(text.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
