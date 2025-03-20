package baekjoon.bronze.b3;

import java.util.*;

class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int maxStarLength = N*2 - 1;
        int starLength = 1; // 처음 시작할 때 별의 개수
        
        /*
            별의 개수(starLength)는 1로 시작해서 N번째 줄까지 2씩 증가.
            N+1번째 줄부터 끝까지는 2씩 감소.
            빈칸의 길이는 (최대 길이 - 별의 개수) / 2로 구함.
            결론: (빈칸 + 별 + 빈칸) 출력.
        */
        for (int i = 0; i < N*2 - 1; i++) {
            if (i < N) {
                starLength = 1 + (i * 2);
            } else {
                starLength -= 2;
            }

            String stars = "*".repeat(starLength);
            String space = " ".repeat((maxStarLength - starLength) / 2);

            System.out.println(space + stars + space);
        }
    }
}