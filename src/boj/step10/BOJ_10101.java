package boj.step10;

import java.util.Scanner;

public class BOJ_10101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();

        int b = sc.nextInt();
        sc.nextLine();

        int c = sc.nextInt();

        int sum = a + b + c;

        if (sum != 180) {
            System.out.println("Error");
        } else {
            if (a == 60 && b == 60 && c == 60) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

    }
}
