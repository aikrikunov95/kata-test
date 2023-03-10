import org.junit.Test;
import ru.aikrikunov95.Calc;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void arabicOk() {
        String input = "1 + 10";
        Calc calc = new Calc();
        String result = calc.run(input);
        assertEquals("11", result);
    }

    @Test
    public void dropFraction() {
        String input = "7 / 2";
        Calc calc = new Calc();
        String result = calc.run(input);
        assertEquals("3", result);
    }

    @Test
    public void arabicNegativeOk() {
        String input = "1 - 2";
        Calc calc = new Calc();
        String result = calc.run(input);
        assertEquals("-1", result);
    }

    @Test(expected = Exception.class)
    public void arabicNegativeError() {
        String input = "I - II";
        Calc calc = new Calc();
        calc.run(input);
    }

    @Test
    public void romanOk() {
        String input = "I + X";
        Calc calc = new Calc();
        String result = calc.run(input);
        assertEquals("XI", result);
    }

    @Test(expected = Exception.class)
    public void largeNumber1() {
        String input = "11 + 1";
        Calc calc = new Calc();
        calc.run(input);
    }

    @Test(expected = Exception.class)
    public void largeNumber2() {
        String input = "1 + 11";
        Calc calc = new Calc();
        calc.run(input);
    }

    @Test(expected = Exception.class)
    public void largeNumber3() {
        String input = "XI + I";
        Calc calc = new Calc();
        calc.run(input);
    }

    @Test(expected = Exception.class)
    public void largeNumber4() {
        String input = "I + XI";
        Calc calc = new Calc();
        calc.run(input);
    }

    // Tests from assignment

    @Test
    public void assignment1() {
        String input = "1 + 2";
        Calc calc = new Calc();
        String result = calc.run(input);
        assertEquals("3", result);
    }

    @Test
    public void assignment2() {
        String input = "VI / III";
        Calc calc = new Calc();
        String result = calc.run(input);
        assertEquals("II", result);
    }

    @Test(expected = Exception.class)
    public void assignment3() {
        String input = "I - II";
        Calc calc = new Calc();
        calc.run(input);
    }

    @Test(expected = Exception.class)
    public void assignment4() {
        String input = "I + 1";
        Calc calc = new Calc();
        calc.run(input);
    }

    @Test(expected = Exception.class)
    public void assignment5() {
        String input = "1";
        Calc calc = new Calc();
        calc.run(input);
    }

    @Test(expected = Exception.class)
    public void assignment6() {
        String input = "1 + 2 + 3";
        Calc calc = new Calc();
        calc.run(input);
    }
}
