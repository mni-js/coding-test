package baekjoon.silver.s4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Card2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();

        List<Integer> cardList = createCardList(N);
        System.out.println(chooseOneCard(cardList));
    }

    public static int chooseOneCard(List<Integer> list) {
        while (list.size() > 1) {
            list.remove(0);
            list.add( list.get(0));
            list.remove(0);
        }
        return list.get(0);
    }

    public static List<Integer> createCardList(int N) {
        List<Integer> cardList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            cardList.add(i + 1);
        }

        return cardList;
    }
}
