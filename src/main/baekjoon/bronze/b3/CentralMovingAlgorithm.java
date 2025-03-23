package baekjoon.bronze.b3;

import java.util.Scanner;

class CentralMovingAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int initialDotCountRow = 2;

        for (int i = 0; i < N; i++) {
            initialDotCountRow += (initialDotCountRow - 1);
        }

        int numOfDot = initialDotCountRow * initialDotCountRow;
        System.out.println(numOfDot);
    }
}