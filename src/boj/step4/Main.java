package boj.step4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        double[] newArray = setNewScore(array, getMax(array));
        System.out.println(getAvg(newArray));
    }

    public static double getAvg(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static double[] setNewScore(int[] array, int M) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (double) array[i] / M * 100;
        }

        return newArray;
    }

    public static int getMax(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }
}
