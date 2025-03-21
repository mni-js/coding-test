package baekjoon.bronze.b1;

import java.util.Scanner;

public class TobeChairman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int k = scanner.nextInt(); // k층
            int n = scanner.nextInt(); // n호
            int[][] residentCounts = new int[k + 1][n];

            for (int floor = 0; floor <= k; floor++) {
                for (int door = 0; door < n; door++) {
                    if (floor == 0) {
                        residentCounts[floor][door] = door + 1;
                    } else {
                        if (door == 0) {
                            residentCounts[floor][door] = 1;
                        } else {
                            residentCounts[floor][door] = residentCounts[floor - 1][door] + residentCounts[floor][door - 1];
                        }
                    }
                }
            }

            sb.append(residentCounts[k][n - 1]).append("\n");
        }
        System.out.println(sb);
    }
}
