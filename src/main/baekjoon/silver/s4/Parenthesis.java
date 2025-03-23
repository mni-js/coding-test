package silver.s4;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Parenthesis {
    public static boolean validPS(String inputString) {
        List<String> psList = new LinkedList<>();
        String[] inputElements = inputString.split("");
        for (String inputElement : inputElements) {
            if (psList.isEmpty()) {
                if (inputElement.equals(")")) {
                    return false;
                }
                psList.add(inputElement);
            } else {
                if (inputElement.equals("(")) {
                    psList.add(inputElement);
                } else if (inputElement.equals(")") && psList.get(psList.size() - 1).equals("(")) {
                    psList.remove(psList.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return psList.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());
        for (int i = 0; i < T; i++) {
            String inputString = reader.readLine();
            if (validPS(inputString)) {
                writer.write("YES" + "\n");
            } else {
                writer.write("NO" + "\n");
            }
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
