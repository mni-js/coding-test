package baekjoon.bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class WordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputWord = reader.readLine().toUpperCase();

        Map<Character, Integer> alphabetCount = new HashMap<>();
        for (int i = 0; i < inputWord.length(); i++) {
            char key = inputWord.charAt(i);
            alphabetCount.put(key, alphabetCount.getOrDefault(key, 0) + 1);
        }

        // 최빈값 찾기
        int maxCount = Collections.max(alphabetCount.values());
        List<Character> mostUsedAlphabets = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : alphabetCount.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostUsedAlphabets.add(entry.getKey());
            }
        }

        // 결과 출력
        if (mostUsedAlphabets.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(mostUsedAlphabets.get(0));
        }
    }
}
