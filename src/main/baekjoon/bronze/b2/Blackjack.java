package baekjoon.bronze.b2;

import java.io.*;
import java.util.Arrays;

class Blackjack {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(reader.readLine().split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        int N = NM[0], M = NM[1];
        int maxLessthanM = 0;

        String[] inputCards = reader.readLine().split(" ");
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(inputCards[i]);
        }

        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sumOfCardsNumber = cards[i] + cards[j] + cards[k];
                    if (sumOfCardsNumber <= M && sumOfCardsNumber > maxLessthanM) {
                        maxLessthanM = sumOfCardsNumber;
                    }
                }
            }
        }
        System.out.println(maxLessthanM);
    }
}
