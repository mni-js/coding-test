package baekjoon.bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NumeralSystem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NB = reader.readLine().split(" ");
        int N = Integer.parseInt(NB[0]);
        int B = Integer.parseInt(NB[1]);
        int exponent = 0;
        String result = "";

        while (true) {
            int biggerThanN = (int) Math.pow(B, exponent);
            if (N >= biggerThanN) {
                exponent++;
                continue;
            }
            int nthPower = (int) Math.pow(B, exponent - 1);
            int digitB = (int) N / nthPower;
            N -= nthPower * digitB; 

            if (digitB >= 10) {
                result += (char) (digitB + 55);
            } else {
                result += digitB;
            }
            exponent--;
            if (exponent == 0) {
                break;
            }
        }

        System.out.println(result);
    }
}
