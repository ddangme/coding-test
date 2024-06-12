package boj.step05;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int arr[] = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
