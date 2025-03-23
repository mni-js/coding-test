package baekjoon.bronze.b3;

import java.io.*;
import java.util.*;

class FourthDot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> xPoints = new ArrayList<>();
        List<Integer> yPoints = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int[] xyPoints = Arrays.stream(reader.readLine().split(" "))
                                   .mapToInt(Integer::parseInt)
                                   .toArray();
            int xPoint = xyPoints[0], yPoint = xyPoints[1];

            if (xPoints.contains(xPoint)) {
                xPoints.remove(xPoints.indexOf(xPoint));
            } else {
                xPoints.add(xPoint);
            }

            if (yPoints.contains(yPoint)) {
                yPoints.remove(yPoints.indexOf(yPoint));
            } else {
                yPoints.add(yPoint);
            }
        }
        System.out.println(xPoints.get(0) + " " + yPoints.get(0));
    }
}
