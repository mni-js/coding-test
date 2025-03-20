package baekjoon.bronze.b2;

import java.io.*;

class NumeralSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NB = reader.readLine().split(" ");
        String N = NB[0];
        int B = Integer.parseInt(NB[1]);
        int decimalNumber = 0;
        String digitRegex = "[0-9]";
        String alphabetRegex = "[A-Z]";

        for (int i = N.length() - 1; i >= 0; i--) {
            String element = String.valueOf(N.charAt(i));
            int convertedNumber = 0;
            if (element.matches(digitRegex)) {
                convertedNumber = Integer.parseInt(element) * ((int) Math.pow(B, ((N.length() - 1) - i)));
            } else if (element.matches(alphabetRegex)) {
                convertedNumber = (N.charAt(i) - 55) * ((int) Math.pow(B, ((N.length() - 1) - i)));
            }
            decimalNumber += convertedNumber;
        }

        System.out.println(decimalNumber);
    }
}