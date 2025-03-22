package baekjoon.silver.s5;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class SortbyAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        String[][] membersInfo = new String[N][];
        for (int i = 0; i < N; i++) {
            membersInfo[i] = reader.readLine().split(" ");
        }
        reader.close();

        Arrays.sort(membersInfo, Comparator.comparingInt(x -> Integer.parseInt(x[0])));

        for (String[] strings : membersInfo) {
            writer.write(strings[0] + " " + strings[1] + "\n");
        }
        writer.flush();
        writer.close();
    }
}
