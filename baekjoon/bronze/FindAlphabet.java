package baekjoon.bronze;

import java.io.*;

class FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String S = bf.readLine();
        char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char alphabet: alphabetArray) {
            System.out.print(S.indexOf(alphabet) + " ");
        }

        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(S.indexOf(i));
            System.out.print(" ");
        }
    }
}