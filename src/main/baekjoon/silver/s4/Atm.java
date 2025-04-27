package baekjoon.silver.s4;

import java.util.*;

public class Atm {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Integer> timeToWithdraw = new ArrayList<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int P = sc.nextInt();
            timeToWithdraw.add(P);
        }
        Collections.sort(timeToWithdraw, Collections.reverseOrder());

        int time = 0;
        for (int i = 0; i < timeToWithdraw.size(); i++) {
            time += timeToWithdraw.get(i) * (i + 1);
        }
        System.out.println(time);
    }
}
