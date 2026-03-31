import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSimpleAddition() {
        String result = Calculator.Run("2+3");
        assertEquals("5.0", result);
    }

    @Test
    public void testOperationPriority() {
        String result = Calculator.Run("10+5*4");
        assertEquals("30.0", result);
    }

    @Test
    public void testInvalidInput() {
        String result = Calculator.Run("5++3");
        assertEquals("ERROR", result);
    }
}
