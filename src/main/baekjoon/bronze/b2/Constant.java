package baekjoon.bronze.b2;

import java.io.*;

class Constant {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = bf.readLine().split(" ");
        int firstNum = Integer.parseInt(new StringBuilder(numbers[0]).reverse().toString());
        int secondNum = Integer.parseInt(new StringBuilder(numbers[1]).reverse().toString());

        System.out.println(Math.max(firstNum, secondNum));
    }
}