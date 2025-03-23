package baekjoon.silver.s4;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class BalancedWorld {
    private static String validBalance(String inputString) {
        List<String> stack = new LinkedList<>();
        String[] inputStringElement = inputString.split("");
        for (String s : inputStringElement) {
            if (s.equals("(") || s.equals("[")) {
                stack.add(s);
            }

            if (stack.isEmpty()) {
                if (s.equals(")") || s.equals("]")) {
                    return "no";
                }
            } else {
                if ((s.equals(")") && stack.get(stack.size() - 1).equals("("))
                        || (s.equals("]") && stack.get(stack.size() - 1).equals("["))) {
                    stack.remove(stack.size() - 1);
                } else if (s.equals(")") && !stack.get(stack.size() - 1).equals("(")) {
                    return "no";
                } else if (s.equals("]") && !stack.get(stack.size() - 1).equals("[")) {
                    return "no";
                }
            }
        }
        if (stack.isEmpty()) {
            return "yes";
        }
        return "no";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.equals(".")) {
                break;
            }
            writer.write(validBalance(line) + "\n");
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
