package baekjoon.bronze.b1;

import java.io.*;
import java.util.Arrays;

public class NumberSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int[] intArray = new int[N];
        for (int i = 0; i < N; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        Arrays.sort(intArray);
        for (int i : intArray) {
            writer.write(i + "\n");
        }
        writer.flush();
        writer.close();
    }
}
