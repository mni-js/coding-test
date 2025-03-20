package baekjoon.bronze.b2;

import java.io.*;

class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            String[] RS = bf.readLine().split(" ");

            int R = Integer.parseInt(RS[0]);
            String[] arrayS = RS[1].split("");

            for (String s: arrayS) {
                System.out.print(s.repeat(R));
            }
            System.out.println();
        }
    }
}