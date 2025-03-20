package baekjoon.bronze.b4;

import java.util.*;

class MemorizeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> angles = new ArrayList<>();
        int sameAngleCnt = 1;
        for (int i = 0; i < 3; i++) {
            int angle = scanner.nextInt();
            if (angles.contains(angle)) {
                sameAngleCnt++;
            }
            angles.add(angle);
        }
        int sumOfAngle = angles.stream()
                               .mapToInt(Integer::intValue)
                               .sum();

        if (sumOfAngle == 180) {
            if (sameAngleCnt == 3) {
                System.out.println("Equilateral");
            } else if (sameAngleCnt == 2) {
                System.out.println("Isosceles");
            } else if (sameAngleCnt == 1) {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
