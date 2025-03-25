package silver.s4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int[] targetNums = new int[N];

        StringTokenizer targetTokenizer = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            targetNums[i] = Integer.parseInt(targetTokenizer.nextToken());
        }
        Arrays.sort(targetNums);

        int M = Integer.parseInt(reader.readLine());
        int[] numsToCheck = new int[M];

        StringTokenizer checkTokenizer = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < M; i++) {
            numsToCheck[i] = Integer.parseInt(checkTokenizer.nextToken());
        }

        for (int num : numsToCheck) {
            if (Arrays.binarySearch(targetNums, num) < 0) {
                writer.write(0 + "\n");
            } else {
                writer.write(1 + "\n");
            }
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
