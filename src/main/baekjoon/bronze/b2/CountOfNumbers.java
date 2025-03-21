package baekjoon.bronze.b2;

import java.util.Scanner;

public class CountOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        String multiplyResultString = String.valueOf(num1 * num2 * num3);
        scanner.close();

        int[] counts = new int[10];
        for (int i = 0; i < multiplyResultString.length(); i++) {
            switch (multiplyResultString.charAt(i)) {
                case '0' -> counts[0] += 1;
                case '1' -> counts[1] += 1;
                case '2' -> counts[2] += 1;
                case '3' -> counts[3] += 1;
                case '4' -> counts[4] += 1;
                case '5' -> counts[5] += 1;
                case '6' -> counts[6] += 1;
                case '7' -> counts[7] += 1;
                case '8' -> counts[8] += 1;
                case '9' -> counts[9] += 1;
            }
        }

        for (int count : counts) {
            System.out.println(count);
        }
    }
}
