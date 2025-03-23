package baekjoon.bronze.b3;

import java.io.*;
import java.util.*;

public class MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int row = 0;
        int column = 0;
        int maxValue = 0;

        for (int i = 0; i < 9; i++) {
            List<Integer> matrixNumRow = Arrays.stream(reader.readLine().split(" "))
                                           .map(Integer::parseInt)
                                           .toList();

            int maxInRow = Collections.max(matrixNumRow);
            if (maxInRow > maxValue) {
                maxValue = maxInRow;
                row = i;
                column = matrixNumRow.indexOf(maxInRow);
            }
        }

        System.out.println(maxValue);
        System.out.println((row + 1) + " " + (column + 1));
    }
}