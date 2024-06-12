package boj.step04;

import java.util.Scanner;

public class BOJ_10811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int loop = sc.nextInt();
        int[] array = initArray(size);

        for (int i = 0; i < loop; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            if (start != end) {
                change(start, end, array);
            }

        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void change(int start, int end, int[] array) {
        int temp[] = new int[end - start + 1];
        int tempIndex = temp.length - 1;

        for (int i = start; i <= end; i++) {
            temp[tempIndex--] = array[i];
        }

        for (int i = start; i <= end; i++) {
            array[i] = temp[++tempIndex];
        }
    }


    public static int[] initArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        return array;
    }
}
