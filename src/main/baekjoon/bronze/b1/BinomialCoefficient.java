package baekjoon.bronze.b1;

import java.util.Arrays;
import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNums = Arrays.stream(scanner.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        scanner.close();

        int numerator = 1;
        for (int i = 0; i < inputNums[1]; i++) {
            numerator *= (inputNums[0] - i);
        }
        int denominator = 1;
        for (int i = inputNums[1]; i >= 1; i--) {
            denominator *= i;
        }
        System.out.println(numerator / denominator);
    }
}
