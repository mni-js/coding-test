package baekjoon.bronze.b2;

import java.math.BigInteger;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 첫째 줄: 문자열의 길이
        int inputLength = scanner.nextInt();
        scanner.nextLine();

        // 둘째 줄: 영문자 소문자로만 이루어진 문자열
        String lowercaseString = scanner.nextLine();

        BigInteger bigIntegerHash = BigInteger.valueOf(0);
        for (int i = 0; i < lowercaseString.length(); i++) {
            BigInteger term = BigInteger.valueOf(lowercaseString.charAt(i) - 96);
            BigInteger coefficient = BigInteger.valueOf(31).pow(i);
            bigIntegerHash = bigIntegerHash.add(term.multiply(coefficient));
        }
        long hash = bigIntegerHash.remainder(BigInteger.valueOf(1_234_567_891)).longValue();
        System.out.println(hash);
    }
}
