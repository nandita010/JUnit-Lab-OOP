package ie.atu.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest { //click the run button here

    Calculato calc;

    @BeforeEach
    public void setup() {
        calc = new Calculato();
    }

    @Test
    public void testSub_Success() {

        assertEquals(12, calc.sub(16, 4)); //alt+enter to import library

    }
@Test
    public void testSub_Failure() {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.sub(Integer.MIN_VALUE,1));
        assertEquals("Number cannot be greater than or equal to Integer.MIN_VALUE", ex.getMessage());
}

}
