package baekjoon.bronze.b3;

import java.io.*;
import java.util.Arrays;

class FindFactor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(reader.readLine().split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        int N = NK[0];
        int K = NK[1];
        int result = 0;
        int numOfFactors = 0;

        for (int i = 1; i < N+1; i++) {
            if (N % i != 0) {
                continue;
            }
            result = i;
            numOfFactors++;

            if (K == numOfFactors) {
                break;
            }
        }
        result = K > numOfFactors ? 0 : result;
        System.out.println(result);
    }
}
