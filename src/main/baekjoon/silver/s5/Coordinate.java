package baekjoon.silver.s5;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Coordinate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Integer[][] array2d = new Integer[N][];
        for (int i = 0; i < N; i++) {
            array2d[i] = Arrays.stream(reader.readLine().split(" "))
                                         .mapToInt(Integer::parseInt)
                                         .boxed()
                                         .toArray(Integer[]::new);
        }
        Arrays.sort(array2d, Comparator.comparingInt((Integer[] x) -> x[0]).thenComparingInt((Integer[] x) -> x[1]));

        for (Integer[] integers : array2d) {
            writer.write(integers[0] + " " + integers[1] + "\n");
        }
        writer.flush();
        writer.close();
    }
}
