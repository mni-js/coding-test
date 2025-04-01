package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Difficulty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] difficulties = new int[n];
        for (int i = 0; i < n; i++) {
            difficulties[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(difficulties);

        int excludedCount = (int) Math.round(n * 0.15);
        int total = 0;
        for (int i = excludedCount; i < difficulties.length - excludedCount; i++) {
            total += difficulties[i];
        }

        int average = (int) Math.round(total / (double) (difficulties.length - (excludedCount * 2)));
        System.out.println(average);

        reader.close();
    }
}
