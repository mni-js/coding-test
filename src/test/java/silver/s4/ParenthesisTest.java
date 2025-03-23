package silver.s4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisTest {
    @Test
    @DisplayName("올바른 형태인데 (가 더 많음")
    void test1() {
        Assertions.assertAll(
                () -> Assertions.assertFalse(Parenthesis.validPS("(()")),
                () -> Assertions.assertFalse(Parenthesis.validPS("(()()")),
                () -> Assertions.assertFalse(Parenthesis.validPS("((())"))
        );
    }

    @Test
    @DisplayName("올바른 형태인데 )가 더 많음")
    void test2() {
        Assertions.assertAll(
                () -> Assertions.assertFalse(Parenthesis.validPS("())")),
                () -> Assertions.assertFalse(Parenthesis.validPS("(()()))")),
                () -> Assertions.assertFalse(Parenthesis.validPS("()())"))
        );
    }

    @Test
    @DisplayName(")로 시작 혹은 (로 끝남")
    void test3() {
        Assertions.assertAll(
                () -> Assertions.assertFalse(Parenthesis.validPS(")()")),
                () -> Assertions.assertFalse(Parenthesis.validPS("(()()("))
        );
    }

    @Test
    @DisplayName("성공")
    void test_Success() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(Parenthesis.validPS("()")),
                () -> Assertions.assertTrue(Parenthesis.validPS("(()()())")),
                () -> Assertions.assertTrue(Parenthesis.validPS("(())()")),
                () -> Assertions.assertTrue(Parenthesis.validPS("(((()()())))"))
        );
    }

}