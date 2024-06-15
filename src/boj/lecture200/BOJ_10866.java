package boj.lecture200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque<>();

        int loop = Integer.parseInt(br.readLine());

        for (int l = 0; l < loop; l++) {
            String text = br.readLine();

            if (text.contains("push_") || text.contains("pop_")) {
                String[] split = text.split(" ");

                if (split[0].equals("push_back")) {
                    deque.addLast(Integer.parseInt(split[1]));
                } else if (split[0].equals("push_front")) {
                    deque.addFirst(Integer.parseInt(split[1]));
                } else if (split[0].equals("pop_front")) {
                    if (deque.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(deque.removeFirst());
                    }
                } else {
                    if (deque.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(deque.removeLast());
                    }
                }
            } else if (text.equals("size")) {
                System.out.println(deque.size());
            } else if (text.equals("empty")) {
                System.out.println(deque.isEmpty() ? 1 : 0);
            } else if (text.equals("front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.getFirst());
                }
            } else {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.getLast());
                }
            }
        }
    }
}
