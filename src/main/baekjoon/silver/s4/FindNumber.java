package baekjoon.silver.s4;

import java.io.*;
import java.util.Arrays;

public class FindNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int[] targetNums = Arrays.stream(reader.readLine().split(" "))
                                 .mapToInt(Integer::parseInt)
                                 .toArray();
        int M = Integer.parseInt(reader.readLine());
        int[] numsToCheck = Arrays.stream(reader.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
        reader.close();

        depth1: for (int checkNum : numsToCheck) {
            depth2: for (int target : targetNums) {
                if (checkNum == target) {
                    writer.write(1 + "\n");
                    continue depth1;
                }
            }
            writer.write(0 + "\n");
        }
        writer.flush();
        writer.close();
    }
}
