package baekjoon.bronze.b2;

import java.util.*;

class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        List<Integer> primeList = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            if (i == 1) {
                continue;
            }
            int factorCnt = 0;
            for (int k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    factorCnt++;
                    break;
                }
            }

            if (factorCnt == 0) {
                primeList.add(i);
            }
        }

        if (primeList.isEmpty()) {
            System.out.println(-1);
        } else {
            int sumOfPrimes = primeList.stream()
                                   .mapToInt(Integer::intValue)
                                   .sum();
            System.out.println(sumOfPrimes);
            System.out.println(primeList.get(0));
        } 
    }
}
