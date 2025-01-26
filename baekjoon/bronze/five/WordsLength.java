package baekjoon.bronze.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class WordsLength {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();
        System.out.println(word.length());
    }
}