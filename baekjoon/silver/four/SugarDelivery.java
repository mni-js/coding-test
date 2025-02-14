import java.util.Scanner;

class SugarDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 3 <= N(kg) <= 5000 
        int minPaperbagCnt = Integer.MAX_VALUE;

        int bag5Cnt = N / 5;
        while (true) {
            if (bag5Cnt == 0) { // 5킬로그램 0개일 때, 3킬로그램 봉지에 담아도 나머지가 있고 최소봉지값이 갱신되지 않은 상태면 -1, 나머지가 없으면 값 출력. 
                if (N % 3 != 0 && minPaperbagCnt == Integer.MAX_VALUE) {
                    minPaperbagCnt = -1;
                    break;
                }
                minPaperbagCnt = Math.min(minPaperbagCnt, N / 3);
                break;
            }

            if ((N - (5 * bag5Cnt)) % 3 != 0) { // (총 무게 - 5킬로그램 봉지에 담긴 무게) = 3킬로그램 봉지에 담길 무게. 
                bag5Cnt--;
                continue; // 3킬로그램 봉지에 담았는데 나머지가 있으면 다음 반복문으로 넘김.
            }
            minPaperbagCnt = Math.min(minPaperbagCnt, bag5Cnt + ((N - (5 * bag5Cnt)) / 3));

            bag5Cnt--;
        }
        System.out.println(minPaperbagCnt);
    }
}
