package baekjoon.bronze.b2;

import java.io.*;

class Dial {
    public static void main(String[] args) throws IOException {
        String[] dialAlphabets = "ABC DEF GHI JKL MNO PQRS TUV WXYZ".split(" ");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] words = bf.readLine().split("");

        int totalTime = 0;

        for (String w: words) {
            for (int i = 0; i < dialAlphabets.length; i++) {
                if (dialAlphabets[i].contains(w)) {
                    totalTime += (i + 3);
                    break;
                }
            }
        }

        System.out.println(totalTime);
    }
}