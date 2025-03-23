package baekjoon.bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] threeWords = new String[3];
        int nextNum = 0;
        for (int i = 0; i < threeWords.length; i++) {
            threeWords[i] = reader.readLine();
        }

        for (int i = 0; i < threeWords.length; i++) {
            try {
                nextNum = Integer.parseInt(threeWords[i]);
            } catch (NumberFormatException e) {
                continue;
            }

            nextNum = switch (i) {
                case 0 -> nextNum + 3;
                case 1 -> nextNum + 2;
                default -> nextNum + 1;
            };
            break;
        }

        if (nextNum % 3 == 0) {
            if (nextNum % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        } else if (nextNum % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextNum);
        }
    }
}
