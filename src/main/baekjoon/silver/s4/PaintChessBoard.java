package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    < 문제 >
    1. M(열 개수) x N(행 개수) 크기의 보드를 8 x 8 크기로 잘라서 체스판을 만들려고 함.
    2. 다시 칠해야 하는 정사각형의 최소 개수 구하기.
    < 해결 방법 >
    1. 왼쪽 맨 위에서부터 시작.
        1-1. 첫번째 칸이 흰색일 경우, 다시 칠해야하는 정사각형 개수 구하기.
        1-2. 첫번째 칸이 검은색일 경우, 다시 칠해야하는 정사각형 개수 구하기.
        1-3. min(1-1결과, 1-2결과) 구하기.
    2. 시작점을 가로로 1칸 옮겨서 1번 내용 반복.
        2-1. 가로 시작점은 (N-7)이 한계점. 그래야 끝이 N임.
        2-2. 세로 시작점은 (M-7)이 한계점.
    3. 가장 작은 min값 구하기.
 */
public class PaintChessBoard {
    public static void main(String[] args) throws IOException {
        // 1. 우선 입력부터 잘 구현해보자.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer boardSizeTokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(boardSizeTokenizer.nextToken()); // 행
        int M = Integer.parseInt(boardSizeTokenizer.nextToken()); // 열

        String[][] board = new String[N][M];
        for (int i = 0; i < N; i++) {
            String[] rowData = reader.readLine().split("");
            if (rowData.length != M) {
                throw new IllegalArgumentException();
            }
            for (int j = 0; j < M; j++) {
                board[i][j] = rowData[j];
            }
        }

        // 2. 왼쪽 위부터 8x8 모양을 만들어가며 순회하자.
        int minRecolorCount = Integer.MAX_VALUE; // 다시 색칠해야되는 칸 수 최솟값.
        String[] colors = {"B", "W"};

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int startBlackCount = 0;
                int startWhiteCount = 0;

                // 왼쪽 맨위가 Black으로 시작할 경우
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        int colorIdx = (k + l) % 2;
                        if (!board[i + k][j + l].equals(colors[colorIdx])) {
                            startBlackCount++;
                        }
                    }
                }
                // 왼쪽 맨위가 White로 시작할 경우
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        int colorIdx = (k + l) % 2;
                        if (!board[i + k][j + l].equals(colors[1 - colorIdx])) {
                            startWhiteCount++;
                        }
                    }
                }
                minRecolorCount = Math.min(minRecolorCount, Math.min(startBlackCount, startWhiteCount));
            }
        }
        System.out.println(minRecolorCount);
    }
}
