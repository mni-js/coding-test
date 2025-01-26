package baekjoon.bronze.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CharString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input_word = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(input_word.charAt(i-1));
    }
}