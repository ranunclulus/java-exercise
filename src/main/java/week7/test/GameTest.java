package week7.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import week7.service.IOperator;
import week7.service.OpGame;
import week7.service.PlusOperatorLevelOne;

public class GameTest {

    @Test
    public void test() {
        OpGame game = new OpGame((IOperator) new PlusOperatorLevelOne());

        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(3, game.getRemainingAnswers());
        assertEquals(false, game.isAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.isAnswer(2));
    }

    @Test
    public void testRandom() {
        System.out.println( (int)(Math.random() * 10) );
    }

    @Test
    public void testSumMax() {
        int max = 10;
        int a = (int)(Math.random() * max);
        int b = (int)(Math.random() * (max - a));
        System.out.printf("%d + %d = %d", a, b, a+b);
        assertTrue(a + b < max);
    }
}

