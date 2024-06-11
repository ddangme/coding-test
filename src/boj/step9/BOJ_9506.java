package boj.step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BOJ_9506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = Integer.parseInt(sc.nextLine());
            if (number == -1) {
                break;
            }

            calculate(number);
        }
    }

    public static void calculate(int input) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                numbers.add(i);
            }
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        if (sum == input) {
            System.out.print(input + " = ");
            System.out.println(numbers.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" + ")));
        } else {
            System.out.println(input + " is NOT perfect.");
        }
    }
}
