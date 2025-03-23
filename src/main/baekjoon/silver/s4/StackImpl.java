package silver.s4;

import java.io.*;
import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            String[] inputCommand = reader.readLine().split(" ");

            switch (inputCommand[0]) {
                case "push" -> stack.push(Integer.parseInt(inputCommand[1]));
                case "pop" -> {
                    if (!stack.empty()) {
                        writer.write(stack.pop() + "\n");
                    } else {
                        writer.write(-1 + "\n");
                    }
                }
                case "size" -> writer.write(stack.size() + "\n");
                case "empty" -> writer.write((stack.empty() ? 1 : 0) + "\n");
                default -> {
                    if (!stack.empty()) {
                        writer.write(stack.peek() + "\n");
                    } else {
                        writer.write(-1 + "\n");
                    }
                }
            }
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
