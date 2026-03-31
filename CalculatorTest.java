import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalculate() {

        String expression = "10+5*4";
        String expectedResult = "30.0";

        String actualResult = Calculator.Run(expression);

        assertEquals(expectedResult, actualResult);
    }
}


