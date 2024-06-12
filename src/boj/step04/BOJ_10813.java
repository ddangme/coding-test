package boj.step04;

import java.util.Scanner;

public class BOJ_10813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = initArray(N);

        for (int i = 0; i < M; i++) {
            int index1 = sc.nextInt() - 1;
            int index2 = sc.nextInt() - 1;

            if (index1 != index2) {
                int temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] initArray(int N) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

        return array;
    }
}
