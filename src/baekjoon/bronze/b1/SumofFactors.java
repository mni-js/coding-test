package baekjoon.bronze.b1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SumofFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        while (true) {
            List<String> factors = new ArrayList<>();
            int n = scanner.nextInt();
            if (n == -1) {
                sb.setLength(sb.length() - 1);
                break;
            }

            for (int i = 1; i <= (Math.sqrt(n)); i++) {
                if (n % i == 0) {
                    factors.add(String.valueOf(i));
                    factors.add(String.valueOf(n / i));
                }
            }
            factors.sort((o1, o2) -> Integer.compare(Integer.parseInt(o1), Integer.parseInt(o2)));
            factors.remove(factors.size() - 1);

            int sumofFactors = factors.stream()
                                      .mapToInt(Integer::parseInt)
                                      .sum();
            
            if (n == sumofFactors) {
                sb.append(n + " = ");
                sb.append(String.join(" + ", factors) + "\n");
            } else {
                sb.append(n + " is NOT perfect." + "\n");
            }
        }
        System.out.println(sb);
    }
}
