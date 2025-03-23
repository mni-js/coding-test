package baekjoon.bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class VerticalRead {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> verticalSequence = new ArrayList<>();
        int wordsMaxLength = 0;
        String verticalReadWord;

        for (int i = 0; i < 5; i++) {
            String inputWord = reader.readLine();
            verticalSequence.add(inputWord);
            if (inputWord.length() >  wordsMaxLength) {
                wordsMaxLength = inputWord.length();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordsMaxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (verticalSequence.get(j).length() <= i) {
                    continue;
                }
                sb.append(verticalSequence.get(j).charAt(i));
            }
        }

        verticalReadWord = sb.toString();
        System.out.println(verticalReadWord);
    }
}