import org.junit.Test;
import ru.aikrikunov95.RomanConverter;

import static org.junit.Assert.assertEquals;

public class RomanConverterTest {

    @Test
    public void toIntOk() {
        String input = "MCMXV";
        RomanConverter parser = new RomanConverter();
        assertEquals(1915, parser.toInt(input));
    }

    @Test(expected = Exception.class)
    public void wrongInput() {
        String input = "1";
        RomanConverter parser = new RomanConverter();
        parser.toInt(input);
    }

    @Test
    public void toRomanOk() {
        int i = 1915;
        RomanConverter parser = new RomanConverter();
        assertEquals("MCMXV", parser.toRoman(i));
    }
}
