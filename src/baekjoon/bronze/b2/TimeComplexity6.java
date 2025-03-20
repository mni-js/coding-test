package baekjoon.bronze.b2;

import java.util.Scanner;

class TimeComplexity6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long count = 0L;

        for (long i = 1L; i <= n - 2; i++) {
            count += (n - 1 - i) * i;
        }
        
        System.out.println(count);
        System.out.println(3);
    }
}
