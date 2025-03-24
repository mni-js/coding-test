package silver.s4;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueImpl {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            String command = reader.readLine();
            if (command.matches("push [0-9]+")) {
                queue.addLast(Integer.parseInt(command.split(" ")[1]));
            } else if (command.equals("pop")) {
                try {
                    writer.write(queue.pop() + "\n");
                } catch (NoSuchElementException e) {
                    writer.write(-1 + "\n");
                }
            } else if (command.equals("size")) {
                writer.write(queue.size() + "\n");
            } else if (command.equals("empty")) {
                writer.write((queue.isEmpty() ? 1 : 0) + "\n");
            } else if (command.equals("front")) {
                writer.write((queue.peekFirst() == null ? -1 : queue.peekFirst()) + "\n");
            } else if (command.equals("back")) {
                writer.write((queue.peekLast() == null ? -1 : queue.peekLast()) + "\n");
            }
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
