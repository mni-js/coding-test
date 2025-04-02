package silver.s3;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int M = Integer.parseInt(tokenizer.nextToken());
        int N = Integer.parseInt(tokenizer.nextToken());

        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < N - M + 1; i++) {
            numbers.add(M + i);
        }

        int nSquare = (int) Math.round(Math.sqrt(N)); // N의 제곱근. 여기까지 순회.
        if (numbers.contains(1)) {
            numbers.remove(Integer.valueOf(1));
        }
        for (int i = 2; i <= nSquare; i++) {
            int n = i;
            numbers.removeIf(x -> (x != n) && (x % n == 0));
        }

        for (Integer number : numbers) {
            writer.write(number + "\n");
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
