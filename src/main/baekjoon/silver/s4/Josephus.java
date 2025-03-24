package silver.s4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> josephus = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            josephus.add(i);
        }

        int index = 0;
        writer.write("<");
        while (josephus.size() > 1) {
            index = (index + K - 1) % josephus.size();
            writer.write(josephus.remove(index) + ", ");
        }
        writer.write(josephus.remove(0) + ">");

        scanner.close();
        writer.close();
    }
}
