package baekjoon.bronze.b1;

import java.util.Arrays;
import java.util.Scanner;

public class Gcdlcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNums = Arrays.stream(scanner.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        int gcd = 0;
        for (int i = 1; i <= inputNums[1]; i++) {
            if (inputNums[0] % i == 0 && inputNums[1] % i == 0 && i > gcd) {
                gcd = i;
            }
        }
        int lcm = gcd * (inputNums[0] / gcd) * (inputNums[1] / gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
