package baekjoon.bronze.b2;

import java.util.Scanner;

class Honeycomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int layer = 1;
        int startNum = 1;

        while (N > startNum) {
            layer++;
            startNum += ((layer - 1) * 6);
        }

        System.out.println(layer);
    }
}
