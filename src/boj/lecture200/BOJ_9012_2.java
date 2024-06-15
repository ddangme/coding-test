package boj.lecture200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            System.out.println(solve(br));
        }
    }

    private static String solve(BufferedReader br) throws IOException {
        String text = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < text.length(); j++) {
            char c = text.charAt(j);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        }

        return "NO";
    }

}
