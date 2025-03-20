package baekjoon.bronze.b3;

import java.io.*;
import java.util.*;

class MatrixAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] NM = Arrays.stream(reader.readLine().split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        int[] cumulativeMatrix = new int[NM[0] * NM[1]];
        int matrixIndex = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < NM[0]; j++) {
                int[] elements = Arrays.stream(reader.readLine().split(" "))
                                       .mapToInt(Integer::parseInt)
                                       .toArray();

                if (!verifyInputSize(elements.length, NM[1])) {
                    System.out.println("M 사이즈가 다릅니다.");
                    break;
                }

                for (int k = 0; k < elements.length; k++) {
                    cumulativeMatrix[matrixIndex] += elements[k];
                    matrixIndex++;
                }
            }
            matrixIndex = 0;
        }

        matrixIndex = 0;
        for (int i = 0; i < NM[0]; i++) {
            for (int j = 0; j < NM[1]; j++) {
                System.out.print(cumulativeMatrix[matrixIndex] + " ");
                matrixIndex++;
            }
            System.out.println();
        }
    }

    private static boolean verifyInputSize(int length, int size) {
        if (length == size) {
            return true;
        } else {
            return false;
        }
    }
}
