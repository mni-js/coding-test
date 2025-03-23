package baekjoon.bronze.b3;

import java.io.*;
import java.util.stream.Collectors;
import java.util.*;

class ThreeSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sides = Arrays.stream(reader.readLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .sorted()
                                    .boxed()
                                    .collect(Collectors.toList());

        int shortestSide = sides.get(0), middleSide = sides.get(1), longestSide = sides.get(2);
        if ((shortestSide + middleSide) <= longestSide) {
            longestSide = (shortestSide + middleSide) - 1;
        }
        int perimeter = shortestSide + middleSide + longestSide;
        System.out.println(perimeter);
    }
}
