package silver.s4;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Map<Integer, Integer> deckMap = new HashMap<>();
        int[] deck = Arrays.stream(reader.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .sorted()
                                .toArray();
        for (int i = 0; i < N; i++) {
            deckMap.put(deck[i], deckMap.getOrDefault(deck[i], 0) + 1);
        }

        int M = Integer.parseInt(reader.readLine());
        int[] targetDeck = Arrays.stream(reader.readLine().split(" "))
                                 .mapToInt(Integer::parseInt)
                                 .toArray();

        for (int target : targetDeck) {
            writer.write(deckMap.getOrDefault(target, 0) + " ");
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
