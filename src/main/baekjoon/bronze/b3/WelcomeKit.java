package baekjoon.bronze.b3;

import java.util.Arrays;
import java.util.Scanner;

public class WelcomeKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 첫째 줄 = 참가자의 수
        int totalParticipants = scanner.nextInt();
        scanner.nextLine();
        // 둘째 줄 = 티셔츠 사이즈 별 신청자의 수 (S-M-L-XL-XXL-XXXL)
        int[] participantsByTshirtSize = Arrays.stream(scanner.nextLine().split(" "))
                                              .mapToInt(Integer::parseInt)
                                              .toArray();
        // 셋째 줄 = 티셔츠와 펜의 묶음 수
        int[] tshirtPenBundles = Arrays.stream(scanner.nextLine().split(" "))
                                      .mapToInt(Integer::parseInt)
                                      .toArray();

        // 결과1: 티셔츠 몇 묶음 사야하는지.
        int tshirtBundle = 0;
        for (int count: participantsByTshirtSize) {
            if (count == 0) {
                continue;
            }
            tshirtBundle += ((count - 1) / tshirtPenBundles[0]) + 1;
        }
        System.out.println(tshirtBundle);

        // 결과2: 펜을 최대 몇 묶음 살 수 있는지, 남은 펜 1개씩 몇 자루 주문하면 되는지.
        System.out.println((totalParticipants / tshirtPenBundles[1]) + " " + (totalParticipants % tshirtPenBundles[1]));
    }
}
