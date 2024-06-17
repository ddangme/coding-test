package boj.lecture201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_17413 {

    static String text;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Stack<Character> temp = new Stack<>();


    public static void main(String[] args) throws IOException {
        text = br.readLine();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '<') {
                while (!temp.empty()) {
                    sb.append(temp.pop());
                }
                for (int j = i; j < text.length(); j++) {
                    sb.append(text.charAt(j));
                    if (text.charAt(j) == '>') {
                        i = j;
                        break;
                    }
                }
            } else if (text.charAt(i) != ' '){
                temp.push(text.charAt(i));
            } else if (text.charAt(i) == ' ') {
                while (!temp.empty()) {
                    sb.append(temp.pop());
                }
                sb.append(' ');
            }
        }

        while (!temp.empty()) {
            sb.append(temp.pop());
        }
        System.out.println(sb);
    }
}
