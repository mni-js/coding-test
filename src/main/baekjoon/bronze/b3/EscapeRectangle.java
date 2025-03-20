package baekjoon.bronze.b3;

import java.io.*;
import java.util.Arrays;

class EscapeRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] xywh = Arrays.stream(reader.readLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
        int x = xywh[0], y = xywh[1], w = xywh[2], h = xywh[3];
        
        int minDistance = Integer.MAX_VALUE;
        int[] distances = new int[] {x - 0, y - 0, w - x, h - y};
        for (int d: distances) {
            minDistance = Math.min(minDistance, d);
        }
        System.out.println(minDistance);

    }
}
