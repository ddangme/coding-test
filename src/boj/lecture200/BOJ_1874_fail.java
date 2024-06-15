package boj.lecture200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874_fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int loop = Integer.parseInt(br.readLine());

        int count = 1;
        Stack<Integer> temp = new Stack<>();
        int[] finds = new int[loop];
        for (int i = 0; i < loop; i++) {
            finds[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < loop; i++) {
            if (temp.contains(finds[i])) {
                temp.pop();
                sb.append("-\n");
            } else if (finds[i] > count) {
                while (finds[i] >= count) {
                    temp.push(count);
                    sb.append("+\n");
                    count++;
                }
                temp.pop();
                sb.append("-\n");
            } else {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
        }

        System.out.print(sb);
    }
}
