package baekjoon.silver.s4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Card2Test {


    @Test
    @DisplayName("N = 1")
    void test1() {
        List<Integer> cardList = Card2.createCardList(1);
        Assertions.assertEquals(1, Card2.chooseOneCard(cardList));
    }

    @Test
    @DisplayName("N = 2")
    void test2() {
        List<Integer> cardList = Card2.createCardList(2);
        Assertions.assertEquals(2, Card2.chooseOneCard(cardList));
    }

    @Test
    @DisplayName("N = 3, 7")
    void test3N7() {
        List<Integer> cardList3 = Card2.createCardList(3);
        Assertions.assertEquals(2, Card2.chooseOneCard(cardList3));

        List<Integer> cardList7 = Card2.createCardList(7);
        Assertions.assertEquals(6, Card2.chooseOneCard(cardList7));
    }

    @Test
    @DisplayName("N = 5, 9")
    void test5N9() {
        List<Integer> cardList5 = Card2.createCardList(5);
        Assertions.assertEquals(2, Card2.chooseOneCard(cardList5));

        List<Integer> cardList9 = Card2.createCardList(9);
        Assertions.assertEquals(2, Card2.chooseOneCard(cardList9));
    }

    @Test
    @DisplayName("N = 4, 8")
    void test4N8() {
        List<Integer> cardList4 = Card2.createCardList(4);
        Assertions.assertEquals(4, Card2.chooseOneCard(cardList4));

        List<Integer> cardList8 = Card2.createCardList(8);
        Assertions.assertEquals(8, Card2.chooseOneCard(cardList8));
    }

    @Test
    @DisplayName("N = 6, 10")
    void test6N10() {
        List<Integer> cardList6 = Card2.createCardList(6);
        Assertions.assertEquals(4, Card2.chooseOneCard(cardList6));

        List<Integer> cardList10 = Card2.createCardList(10);
        Assertions.assertEquals(4, Card2.chooseOneCard(cardList10));
    }
}