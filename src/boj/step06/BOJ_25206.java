package boj.step06;

import java.util.Scanner;

public class BOJ_25206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalScore = 0.0;
        double hours = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] splits = sc.nextLine().split(" ");
            double hour = Double.parseDouble(splits[1]);
            String score = splits[2];

            if (!score.equals("P")) {
                totalScore += (getPoint(score) * hour);
                hours += hour;
            }
        }

        System.out.println(totalScore / hours);

    }

    public static double getPoint(String score) {
        switch (score) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
            default:
                return 0.0;
        }
    }
}
