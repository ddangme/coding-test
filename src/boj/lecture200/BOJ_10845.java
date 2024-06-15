package boj.lecture200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_10845 {

    static Queue<Integer> q = new LinkedList<>();
    static int last = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            String text = br.readLine();

            if (text.contains("push")) {
                push(Integer.parseInt(text.split(" ")[1]));
            } else if (text.equals("pop")) {
                System.out.println(pop());
            } else if (text.equals("size")) {
                System.out.println(size());
            } else if (text.equals("empty")) {
                System.out.println(empty());
            } else if (text.equals("front")) {
                System.out.println(front());
            } else {
                System.out.println(back());
            }
        }
    }

    public static void push(int n) {
        q.add(n);
        last = n;
    }

    public static int front() {
        if (q.isEmpty()) {
            return -1;
        }
        return q.peek();
    }

    public static int back() {
        if (q.isEmpty()) {
            return -1;
        }

        return last;
    }

    public static int size() {
        return q.size();
    }

    public static int empty() {
        if (q.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public static int pop() {
        if (q.isEmpty()) {
            return -1;
        }

        return q.poll();
    }
}
