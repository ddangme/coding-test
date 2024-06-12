package boj.step08;

import java.util.Scanner;

public class BOJ_2720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = Integer.parseInt(sc.nextLine());

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int denny = 1;


        for (int i = 0; i < loop; i++) {
            StringBuilder sb = new StringBuilder();

            int pay = Integer.parseInt(sc.next());

            sb.append(pay / quarter).append(" ");
            pay %= quarter;
            sb.append(pay / dime).append(" ");
            pay %= dime;
            sb.append(pay / nickel).append(" ");
            pay %= nickel;
            sb.append(pay / denny).append(" ");

            System.out.println(sb);
        }
    }
}
