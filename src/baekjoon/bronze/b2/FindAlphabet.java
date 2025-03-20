package baekjoon.bronze.b2;

import java.io.*;

class FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String S = bf.readLine();
//        char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        for (char alphabet: alphabetArray) {
//            System.out.print(S.indexOf(alphabet) + " ");
//        }

        char[] hangeulArray = "가나다".toCharArray();
        for (char hangeul : hangeulArray) {
            System.out.print(S.indexOf(hangeul) + " ");
        }
    }
}