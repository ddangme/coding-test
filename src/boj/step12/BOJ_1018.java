package boj.step12;

import java.util.Scanner;

public class BOJ_1018 {

    static char[][] chess;
    static int h;
    static int w;

    static String[] defaultChess = {"W", "B"};

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        setWandH();
        setChessNumbers();

        int result = 999999999;
        for (int i = 0; i < w - 7; i++) {
            for (int j = 0; j < h - 7; j++) {
                int wCount = getDifferentWFirstCount(i, j);
                int bCount = getDifferentBFirstCount(i, j);

                int min = Math.min(wCount, bCount);
                if (min < result) {
                    result = min;
                }
            }
        }

        System.out.println(result);
    }

    public static int getDifferentWFirstCount(int startWIndex, int startHIndex) {
        int count = 0;
        boolean check = false;
        for (int i = 0; i < 8; i++) {
            check = !check;
            for (int j = 0; j < 8; j++) {
                if (check) {
                    if (defaultChess[1].charAt(0) != chess[startWIndex + i][startHIndex + j]) {
                        count++;
                    }
                } else {
                    if (defaultChess[0].charAt(0) != chess[startWIndex + i][startHIndex + j]) {
                        count++;
                    }
                }
                check = !check;
            }
        }

        return count;
    }

    public static int getDifferentBFirstCount(int startWIndex, int startHIndex) {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < 8; i++) {
            check = !check;
            for (int j = 0; j < 8; j++) {
                if (!check) {
                    if (defaultChess[0].charAt(0) != chess[startWIndex + i][startHIndex + j]) {
                        count++;
                    }
                } else {
                    if (defaultChess[1].charAt(0) != chess[startWIndex + i][startHIndex + j]) {
                        count++;
                    }
                }
                check = !check;
            }
        }

        return count;
    }

    public static void setWandH() {
        int hInput = sc.nextInt();
        int wInput = sc.nextInt();
        sc.nextLine();

        h = hInput;
        w = wInput;
    }

    public static void setChessNumbers() {
        chess = new char[w][h];

        for (int hi = 0; hi < h; hi++) {
            String line = sc.nextLine();
            for (int wi = 0; wi < w; wi++) {
                chess[wi][hi] = line.charAt(wi);
            }
        }
    }

}
