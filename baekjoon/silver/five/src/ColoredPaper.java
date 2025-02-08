import java.io.*;
import java.util.*;

class ColoredPaper {
    public static void main(String[] args) throws IOException {
        int[][] backgroundPaper = new int[100][100];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int demension = 0;

        int coloredPaperCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < coloredPaperCount; i++) {
            int[] xyPoint = Arrays.stream(reader.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
            int xPoint = xyPoint[0];
            int yPoint = xyPoint[1];

            for (int x = xPoint; x < xPoint + 10; x++) {
                for (int y = yPoint; y < yPoint + 10; y++) {
                    if (backgroundPaper[x][y] == 1) {
                        continue;
                    }
                    backgroundPaper[x][y] = 1;
                    demension++;
                }
            }
        }

        System.out.println(demension);
    }
}