package boj.lecture200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1406 {

    static Stack<Character> stack = new Stack<>();
    static Stack<Character> temp = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br.readLine());
        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            String text = br.readLine();

            if (text.equals("L")) {
                L();
            } else if (text.equals("D")) {
                D();
            } else if (text.contains("P")) {
                P(text.split(" ")[1].charAt(0));
            } else {
                B();
            }
        }

        while (!temp.empty()) {
            D();
        }

        StringBuilder result = new StringBuilder();
        for (Character ch : stack) {
            result.append(ch);
        }
        System.out.println(result);
    }



    public static void B() {
        if (!stack.empty()) {
            stack.pop();
        }
    }

    public static void L() {
        if (!stack.empty()) {
            temp.add(stack.pop());
        }
    }

    public static void D() {
        if (!temp.empty()) {
            stack.add(temp.pop());
        }
    }

    public static void P(char c) {
        stack.add(c);
    }

    private static void init(String text) {
        char[] charArray = text.toCharArray();

        for (char c : charArray) {
            stack.add(c);
        }
    }

}
