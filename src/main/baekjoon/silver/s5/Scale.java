package baekjoon.silver.s5;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Scale {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        String[][] scaleArray = new String[N][];
        for (int i = 0; i < N; i++) {
            scaleArray[i] = reader.readLine().split(" ");
        }
        reader.close();

        String[][] copyAndSortReverse = Arrays.copyOf(scaleArray, scaleArray.length);
        Arrays.sort(copyAndSortReverse, (x, y) -> Integer.parseInt(y[0]) - Integer.parseInt(x[0]));
        System.out.println(Arrays.deepToString(copyAndSortReverse));

        Map<String[], Integer> placeMap = new HashMap<>();
        int place = 1;
        int samePlaceCount = 0;
        int minHeight = 0;
        for (int i = 0; i < copyAndSortReverse.length; i++) {
            minHeight = Integer.parseInt(copyAndSortReverse[i][1]);
            if (Integer.parseInt(copyAndSortReverse[i][1]) >= Integer.parseInt(copyAndSortReverse[i + 1][1])) {
                placeMap.put(copyAndSortReverse[i], place);
                place++;
            } else {
                samePlaceCount++;
                placeMap.put(copyAndSortReverse[i], place);
            }
        }

    }
}
