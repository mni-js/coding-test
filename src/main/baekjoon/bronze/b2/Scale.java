package baekjoon.bronze.b2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] playOrders = Arrays.stream(scanner.nextLine().split(" "))
                                 .mapToInt(Integer::parseInt)
                                 .boxed()
                                 .toArray(Integer[]::new);

        Integer[] ascending = Arrays.stream(playOrders)
                .sorted()
                .toArray(Integer[]::new);
        Integer[] descending = Arrays.stream(playOrders)
                .sorted((x, y) -> y - x)
                .toArray(Integer[]::new);

        if (Arrays.equals(playOrders, ascending)) {
            System.out.println("ascending");
        } else if (Arrays.equals(playOrders, descending)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        scanner.close();
    }
}
