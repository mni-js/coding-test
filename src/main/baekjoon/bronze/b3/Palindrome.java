package baekjoon.bronze.b3;

import java.io.*;

class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputWord = bf.readLine();

        StringBuilder sb = new StringBuilder(inputWord);
        String reverseWord = sb.reverse().toString();

        System.out.println(inputWord.equals(reverseWord) ? 1 : 0);
    }
}