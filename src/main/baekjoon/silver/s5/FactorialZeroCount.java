package baekjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FactorialZeroCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger factorial = BigInteger.valueOf(1);
        int N = Integer.parseInt(reader.readLine());
        for (int i = N; i >= 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        reader.close();

        String[] stringArray = String.valueOf(factorial).split("");
        int zeroCount = 0;
        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (Integer.parseInt(stringArray[i]) == 0) {
                zeroCount++;
            } else {
                break;
            }
        }
        System.out.println(zeroCount);
    }
}
