package baekjoon.silver.s5;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class SortWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        String[] wordArray = new String[N];
        for (int i = 0; i < N; i++) {
            wordArray[i] = reader.readLine();
        }
        reader.close();

        Arrays.sort(wordArray, Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        String[] sortedArray = Arrays.stream(wordArray).distinct().toArray(String[]::new);

        for (String s : sortedArray) {
            writer.write(s + "\n");
        }
        writer.flush();
        writer.close();
    }
}
