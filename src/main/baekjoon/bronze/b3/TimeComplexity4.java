package baekjoon.bronze.b3;

import java.util.Scanner;

class TimeComplexity4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;

        for (int i = 1; i < n; i++) {
            result += i;
        }
        System.out.println(result);
        System.out.println(2);
    }
}
