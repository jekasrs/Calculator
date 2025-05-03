import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.smirnov.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Test Calculator")
@Feature("Basic operations")
public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test()
    @Story("Addition")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Test addition of two positive numbers")
    public void testAddition() {
        assertEquals(5, calc.add(3, 2));
    }

    @Test()
    @Story("Subtraction")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Test subtraction of two positive numbers")
    public void testSubtract() {
        assertEquals(0, calc.subtract(10, 10));
    }

    @Test()
    @Story("Boundary tests")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Test addition with MAX value")
    public void testOverflowMaxValue() {
        assertEquals(Integer.MIN_VALUE, calc.subtract(Integer.MAX_VALUE, 1));
    }
}
