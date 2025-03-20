package baekjoon.bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ABV = reader.readLine().split(" ");

        int A = Integer.parseInt(ABV[0]);
        int B = Integer.parseInt(ABV[1]);
        int V = Integer.parseInt(ABV[2]);

        int day = (int) Math.ceil((double) (V - A) / (A - B)) + 1;
        System.out.println(day);
    }
}
