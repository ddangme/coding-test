package gr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GR_174704 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        double x = Double.parseDouble(input[0]);
        double y = Double.parseDouble(input[1]);

        double sum = x + y;

        System.out.println(String.format("%.6f", sum));

    }
}
