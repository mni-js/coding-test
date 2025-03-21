package baekjoon.bronze.b2;

import java.util.Scanner;

public class OXQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String line = scanner.nextLine();
            int score = 0;
            int oCount = 0;
            for (int c = 0; c < line.length(); c++) {
                if (line.charAt(c) == 'O') {
                    oCount++;
                    score += oCount;
                } else {
                    oCount = 0;
                }
            }
            sb.append(score).append("\n");
        }
        System.out.println(sb);
    }
}
