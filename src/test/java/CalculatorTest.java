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
    @DisplayName("Test addition of two positiv numbers")
    public void testAddition() {
        assertEquals(5, calc.add(3, 2));
    }
}
