package baekjoon.silver.s5;

import java.io.*;
import java.util.Arrays;

public class SortNumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int[] numArray = new int[N];
        for (int i = 0; i < N; i++) {
            numArray[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        numArray = Arrays.stream(numArray)
                         .distinct()
                         .sorted()
                         .toArray();

        for (int i : numArray) {
            writer.write(i + "\n");
        }
        writer.flush();
        writer.close();
    }
}
