import org.junit.Test;
import ru.aikrikunov95.Operation;
import ru.aikrikunov95.Parser;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void arabicOk() {
        String input = "1 + 10";
        Parser parser = new Parser();
        Parser.Result result = parser.run(input);
        assertEquals(1, result.firstNumber());
        assertEquals(10, result.secondNumber());
        assertEquals(Operation.PLUS, result.operation());
        assertFalse(result.romanMode());
    }

    @Test
    public void romanOk() {
        String input = "I + X";
        Parser parser = new Parser();
        Parser.Result result = parser.run(input);
        assertEquals(1, result.firstNumber());
        assertEquals(10, result.secondNumber());
        assertEquals(Operation.PLUS, result.operation());
        assertTrue(result.romanMode());
    }

    @Test(expected = Exception.class)
    public void mixedFormats() {
        String input = "1 + I";
        Parser parser = new Parser();
        parser.run(input);
    }

    @Test(expected = Exception.class)
    public void wrongSpaces1() {
        String input = "1+ 2";
        Parser parser = new Parser();
        parser.run(input);
    }

    @Test(expected = Exception.class)
    public void wrongSpaces2() {
        String input = "1 +2";
        Parser parser = new Parser();
        parser.run(input);
    }

    @Test(expected = Exception.class)
    public void wrongSpaces3() {
        String input = "1+2";
        Parser parser = new Parser();
        parser.run(input);
    }
}
