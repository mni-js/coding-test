package baekjoon.bronze.b1;

import java.util.Arrays;
import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int subject_num = scanner.nextInt();
        scanner.nextLine();
        int[] scores = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = Arrays.stream(scores)
                .max()
                .getAsInt();

        int sum = 0;
        for (int score: scores) {
            sum += score;
        }
        double avgScore = (double) sum / scores.length;
        double newAvgScore = avgScore / max * 100;

        System.out.println(newAvgScore);
    }
}