package baekjoon.bronze.b3;

import java.util.Arrays;
import java.util.Scanner;

public class ACMHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int numOfTestCase = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfTestCase; i++) {
            int[] hotelInfo = Arrays.stream(scanner.nextLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();
            int totalFloor = hotelInfo[0], totalRoomPerFloor = hotelInfo[1], nthGuest = hotelInfo[2];

            sb.append((nthGuest - 1) % totalFloor + 1);
            int roomNumber = (nthGuest - 1) / totalFloor + 1;
            sb.append(roomNumber < 10 ? "0" + roomNumber : roomNumber);
            sb.append("\n");
        }
        scanner.close();
        System.out.println(sb);
    }
}
