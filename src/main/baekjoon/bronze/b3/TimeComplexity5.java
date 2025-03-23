package baekjoon.bronze.b3;

import java.util.Scanner;

class TimeComplexity5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int degree = 3;
        long result = 1L;
        for (int i = 0; i < degree; i++) {
            result *= n;
        }

        System.out.println(result);
        System.out.println(degree);
    }
}
