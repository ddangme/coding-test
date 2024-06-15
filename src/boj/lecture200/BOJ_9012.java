package boj.lecture200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            String text = br.readLine();
            char[] stack = new char[text.length()];
            int stackIndex = 0;

            for (int j = 0; j < stack.length; j++) {
                if (text.charAt(j) == '(') {
                    stack[stackIndex] = '(';
                    stackIndex++;
                } else if (text.charAt(j) == ')'){
                    if ((stackIndex == 0) || (stack[stackIndex - 1] == ')')) {
                        stackIndex = -1;
                        break;
                    } else {
                        stackIndex--;
                        stack[stackIndex] = '-';
                    }
                }
            }

            if (stackIndex == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
