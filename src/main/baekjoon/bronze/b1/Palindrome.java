package baekjoon.bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String word;
        depth1: while ((word = reader.readLine()) != null) {
            if (word.equals("0") || word.isEmpty()) {
                break;
            }

            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt((word.length() - 1 - i))) {
                    result.append("\nno");
                    continue depth1;
                }
            }
            result.append("\nyes");
        }
        reader.close();
        System.out.println(result.substring(1));
    }
}
