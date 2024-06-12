package boj.step12;

import java.util.Scanner;

public class BOJ_2798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cardLength = sc.nextInt();
        int number = sc.nextInt();
        sc.nextLine();

        int[] array = new int[cardLength];

        for (int i = 0; i < cardLength; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(calculate(cardLength, array, number));
    }

    private static int calculate(int cardLength, int[] array, int number) {
        int result = 0;

        for (int a = 0; a < cardLength - 2; a++) {
            for (int b = a + 1; b < cardLength - 1; b++) {
                for (int c = b + 1; c < cardLength; c++) {
                    int sum = array[a] + array[b] + array[c];
                    if (sum == number) {
                        return sum;
                    }
                    if (sum < number) {
                        if (number - result > number - sum) {
                            result = sum;
                        }
                    }
                }
            }
        }

        return result;
    }
}
