package silver.s5;

import java.io.*;
import java.util.*;

/*
    x kg, y cm -> (x, y)로 표현.
    (x1, y1), (x2, y2)에서 x1 > x2, y1 > y2일 때만 덩치가 더 크다고 표현함.
    그 외에는 같은 덩치로 취급함.
    첫째 줄에는 전체 사람 수 N
    이어지는 N개의 줄에는 x와 y가 공백 한 칸을 두고 입력된다.
 */
public class Scale {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int[][] weightHeights = new int[N][];
        for (int i = 0; i < N; i++) {
            int[] weightHeight = Arrays.stream(reader.readLine().split(" "))
                                       .mapToInt(Integer::parseInt)
                                       .toArray();
            weightHeights[i] = weightHeight;
        }

        for (int i = 0; i < N; i++) {
            int nthPlace = 1;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if ((weightHeights[i][0] < weightHeights[j][0]) && (weightHeights[i][1] < weightHeights[j][1])) {
                        nthPlace++;
                    }
                }
            }
            writer.write(nthPlace + " ");
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
