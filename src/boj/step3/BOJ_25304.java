package boj.step3;

import java.util.Scanner;

public class BOJ_25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long payPrice = sc.nextLong();
        int kindOfCount = sc.nextInt();
        Long actualPrice = 0L;

        for (int i = 0; i < kindOfCount; i++) {
            Long price = sc.nextLong();
            int count = sc.nextInt();

            actualPrice += (price * count);
        }

        if (payPrice.equals(actualPrice)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
