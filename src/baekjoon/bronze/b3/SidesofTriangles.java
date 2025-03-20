package baekjoon.bronze.b3;

import java.io.*;
import java.util.stream.Collectors;
import java.util.*;

class SidesofTriangles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer result = new StringBuffer();

        while (true) {
            String inputSides = reader.readLine();
            if (inputSides.equals("0 0 0")) {
                break;
            }

            List<Integer> sidesOfTriangle = Arrays.stream(inputSides.split(" "))
                                                  .mapToInt(Integer::parseInt)
                                                  .sorted()
                                                  .boxed()
                                                  .collect(Collectors.toList());

            int shortestSide = sidesOfTriangle.get(0);
            int middleSide = sidesOfTriangle.get(1);
            int longestSide = sidesOfTriangle.get(2);
            if (longestSide >= (shortestSide + middleSide)) {
                result.append("Invalid");
            } else if (shortestSide == middleSide && middleSide == longestSide) {
                result.append("Equilateral");
            } else if (shortestSide != middleSide && middleSide != longestSide && longestSide != shortestSide) {
                result.append("Scalene");
            } else {
                result.append("Isosceles");
            }
            result.append("\n");
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }
}
