package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> accountBook = new Stack<>();
        int K = Integer.parseInt(reader.readLine());
        for (int i = 0; i < K; i++) {
            int inputNum = Integer.parseInt(reader.readLine());
            if (inputNum != 0) {
                accountBook.push(inputNum);
            } else if (!accountBook.isEmpty()) {
                accountBook.pop();
            }
        }

        int sum = 0;
        for (Integer i : accountBook) {
            sum += i;
        }
        System.out.println(sum);
    }
}
