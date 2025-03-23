package baekjoon.bronze.b3;

import java.io.*;
import java.util.*;

class Earth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> xPoints = new ArrayList<>();
        List<Integer> yPoints = new ArrayList<>();

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            int[] marblePoints = Arrays.stream(reader.readLine().split(" "))
                                       .mapToInt(Integer::parseInt)
                                       .toArray();

            int xPoint = marblePoints[0], yPoint = marblePoints[1];
            xPoints.add(xPoint);
            yPoints.add(yPoint);
        }
        Collections.sort(xPoints);
        Collections.sort(yPoints);

        int width = xPoints.get(xPoints.size() - 1) - xPoints.get(0);
        int height = yPoints.get(yPoints.size() - 1) - yPoints.get(0);
        System.out.println(width * height);
    }
}
