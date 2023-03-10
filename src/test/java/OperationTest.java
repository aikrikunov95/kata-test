import org.junit.Test;
import ru.aikrikunov95.Operation;

import static org.junit.Assert.assertEquals;

public class OperationTest {

    @Test
    public void parseOK() {
        assertEquals(Operation.PLUS, Operation.parse("+"));
        assertEquals(Operation.MINUS, Operation.parse("-"));
        assertEquals(Operation.STAR, Operation.parse("*"));
        assertEquals(Operation.SLASH, Operation.parse("/"));
    }

    @Test(expected = Exception.class)
    public void wrongParse() {
        assertEquals(Operation.PLUS, Operation.parse(""));
    }
}
