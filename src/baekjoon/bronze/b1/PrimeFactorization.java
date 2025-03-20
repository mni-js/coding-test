package baekjoon.bronze.b1;

import java.util.Scanner;

class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int factor = 2;

        while (N > 1) {
            if (N % factor == 0) {
                System.out.println(factor);
                N /= factor;
                continue;
            }
            factor++;
        }
    }
}
