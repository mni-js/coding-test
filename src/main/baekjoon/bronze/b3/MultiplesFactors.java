package baekjoon.bronze.b3;

import java.io.*;
import java.util.Arrays;

class MultiplesFactors {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while (true) {
            String inputLine = reader.readLine();
            if (inputLine.equals("0 0")) {
                break;
            }

            int[] numArray = Arrays.stream(inputLine.split(" "))
                                   .mapToInt(Integer::parseInt)
                                   .toArray();
            int firstNum = numArray[0];
            int secondNum = numArray[1];

            if (firstNum % secondNum == 0) {
                sb.append("multiple");
            } else if (secondNum % firstNum == 0) {
                sb.append("factor");
            } else {
                sb.append("neither");
            }
            sb.append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
