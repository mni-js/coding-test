package baekjoon.bronze.b2;

import java.io.*;
import java.util.Arrays;

class FindPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] numberArr = Arrays.stream(reader.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        int primeCnt = 0;
        
        for (int n: numberArr) {
            if (n == 1) {
                continue;
            }
            int factorsCnt = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    factorsCnt++;
                }
            }

            if (factorsCnt == 0) {
                primeCnt++;
            }
        }
        System.out.println(primeCnt);
    }
}
