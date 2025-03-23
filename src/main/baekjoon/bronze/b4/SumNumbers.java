package baekjoon.bronze.b4;

import java.io.*;
import java.util.Arrays;

class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int sum = 0;
        int[] nums = Arrays.stream(bf.readLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int num : nums) {
            sum += num;
            System.out.print("");
        }
        System.out.println(sum);
    }
}