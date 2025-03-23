package baekjoon.bronze.b3;

import java.io.*;

class Print {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = bf.readLine();

            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }
}