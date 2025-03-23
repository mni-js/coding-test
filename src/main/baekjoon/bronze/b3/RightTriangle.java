package baekjoon.bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while (!(line = bufferedReader.readLine()).equals("0 0 0")) {
            int[] sideLengths = Arrays.stream(line.split(" "))
                                      .mapToInt(Integer::parseInt)
                                      .toArray();
            double sideASquare = Math.pow(sideLengths[0], 2), sideBSquare = Math.pow(sideLengths[1], 2), sideCSquare = Math.pow(sideLengths[2], 2);

            if ((sideASquare == sideBSquare + sideCSquare) || (sideBSquare == sideCSquare + sideASquare) || (sideCSquare == sideASquare + sideBSquare)) {
                sb.append("\nright");
            } else {
                sb.append("\nwrong");
            }
        }
        System.out.println(sb.substring(1));
    }
}
